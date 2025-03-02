package DAO;

import Interfaces.DAOclienteactividad;
import Logica.ClienteActividad;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOclienteactividadImplementacion extends Conexion implements DAOclienteactividad {

    @Override
    public boolean Modificar(boolean asistencia, int idActividad, int idCliente) throws Exception {
        boolean respuesta = false;
        this.conectar();

        try {
            // Verificar si ya existe el registro
            String verificarSql = "SELECT COUNT(*) FROM TBcliente_actividad WHERE idActividad = ? AND idCliente = ?";
            PreparedStatement psVerificar = conexion.prepareStatement(verificarSql);
            psVerificar.setInt(1, idActividad);
            psVerificar.setInt(2, idCliente);
            ResultSet rs = psVerificar.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                // Si existe, actualizar
                String sql = "UPDATE TBcliente_actividad SET asistencia = ? WHERE idActividad = ? AND idCliente = ?";
                PreparedStatement ps = conexion.prepareStatement(sql);
                ps.setBoolean(1, asistencia);
                ps.setInt(2, idActividad);
                ps.setInt(3, idCliente);
                int modificacion = ps.executeUpdate();
                if (modificacion > 0) {
                    respuesta = true;
                }
                ps.close();
            } else {
                // Si no existe, insertar
                String sqlInsert = "INSERT INTO TBcliente_actividad (idActividad, idCliente, asistencia) VALUES (?, ?, ?)";
                PreparedStatement psInsert = conexion.prepareStatement(sqlInsert);
                psInsert.setInt(1, idActividad);
                psInsert.setInt(2, idCliente);
                psInsert.setBoolean(3, asistencia);
                int insercion = psInsert.executeUpdate();
                if (insercion > 0) {
                    respuesta = true;
                }
                psInsert.close();
            }

            rs.close();
            psVerificar.close();
        } catch (SQLException ex) {
            throw new Exception("Error en Modificar: " + ex.getMessage());
        }

        return respuesta;
    }

    @Override
    public boolean Buscar(int idActividad, int idCliente) throws Exception {
        boolean asistencia = false;
        this.conectar();
        try {
            String sql = "SELECT asistencia FROM TBcliente_actividad WHERE idCliente = ? AND idActividad = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idCliente);
            ps.setInt(2, idActividad);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                asistencia = rs.getBoolean("asistencia");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
        }
        return asistencia;
    }

    @Override
    public List<ClienteActividad> Seleccionar(int idActividad) throws Exception {
        List<ClienteActividad> lista = new ArrayList<>();

        try {
            this.conectar();
            String sql = "SELECT idCliente, idActividad, asistencia FROM TBcliente_actividad WHERE idActividad = ?;";

            PreparedStatement st = this.conexion.prepareStatement(sql);
            st.setInt(1, idActividad); // Asigna el valor del parámetro

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                ClienteActividad ca = new ClienteActividad();
                ca.setIdCliente(rs.getInt("idCliente"));
                ca.setIdActividad(rs.getInt("idActividad"));
                ca.setAsistencia(rs.getBoolean("asistencia"));
                lista.add(ca);
            }

            rs.close();
            st.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            this.cerrar();
        }

        return lista;
    }

}
