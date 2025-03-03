package DAO;

import Interfaces.DAOactividad;
import Logica.Actividad;
import Logica.Articulo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAOactividadImplementacion extends Conexion implements DAOactividad {

    @Override
    public boolean Registrar(Actividad actividad) throws Exception {
        boolean respuesta = false;
        this.conectar();

        // Consulta para insertar en TBactividad
        String sql = "INSERT INTO TBactividad (titulo, descripcion, distrito, fecha, aceptado, idCliente) VALUES ('" + actividad.getTitulo() + "', '" + actividad.getDescripcion() + "', '" + actividad.getDistrito() + "', '" + actividad.getFecha() + "', 0, " + actividad.getIdCliente() + ");";

        Statement st;
        try {
            st = conexion.createStatement();
            int filas_afectadas = st.executeUpdate(sql);

            if (filas_afectadas > 0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            throw new Exception("Error al Registrar: " + ex.getMessage());
        }

        return respuesta;
    }

    @Override
    public boolean Modificar(int idActividad) throws Exception {
        boolean respuesta = false;
        this.conectar();

        String sql = "UPDATE TBactividad SET aceptado = 1 WHERE idActividad = " + idActividad + ";";

        Statement st;
        try {
            st = conexion.createStatement();
            int filas_afectadas = st.executeUpdate(sql);

            if (filas_afectadas > 0) {
                respuesta = true;
            } else {
                throw new Exception("No se encontró una actividad con ese ID");
            }
        } catch (SQLException ex) {
            throw new Exception("Error al Aceptar: " + ex.getMessage());
        }
        return respuesta;
    }

    @Override
    public boolean Eliminar(int idActividad) {
        boolean respuesta = false;

        String sql = "DELETE FROM TBactividad WHERE idActividad = " + idActividad + ";";

        Statement st;
        try {
            this.conectar();
            st = conexion.createStatement();
            int filas_afectadas = st.executeUpdate(sql);

            if (filas_afectadas > 0) {
                respuesta = true;
            }
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        return respuesta;
    }

    @Override
    public ArrayList<Actividad> Seleccionar() {
        ArrayList<Actividad> actividades = null;

        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM TBactividad");

            actividades = new ArrayList<>();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Actividad act = new Actividad();
                act.setIdActividad(rs.getInt("idActividad"));
                act.setTitulo(rs.getString("titulo"));
                act.setDescripcion(rs.getString("descripcion"));
                act.setDistrito(rs.getString("distrito"));
                act.setFecha(rs.getString("fecha"));
                act.setAceptado(rs.getBoolean("aceptado"));
                act.setIdCliente(rs.getInt("idCliente"));

                actividades.add(act);
            }

            rs.close();
            st.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        return actividades;
    }
    
    @Override
    public Actividad SeleccionarD(int idActividad) throws SQLException {
        Actividad actividades = new Actividad();

        try {
            this.conectar();
            String sql = "SELECT a.idActividad, a.titulo, a.descripcion, a.fecha, a.distrito, c.nombre AS nombreUsuario "
                    + "FROM TBactividad a "
                    + "INNER JOIN TBcliente c ON a.idCliente = c.idCliente "
                    + "WHERE a.idActividad = ?;";

            PreparedStatement st = this.conexion.prepareStatement(sql);
            st.setInt(1, idActividad); // Evita inyección SQL

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                actividades.setIdActividad(rs.getInt("idActividad"));
                actividades.setTitulo(rs.getString("titulo"));
                actividades.setDescripcion(rs.getString("descripcion"));
                actividades.setFecha(rs.getString("fecha"));
                actividades.setDistrito(rs.getString("distrito"));
                actividades.setNombreCliente(rs.getString("nombreUsuario")); // <-- Agregado

            }

            rs.close();
            st.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            this.cerrar();
        }

        return actividades;
    }
}
