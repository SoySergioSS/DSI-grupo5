package DAO;

import Interfaces.DAOarticulo;
import Logica.Articulo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DAOarticuloImplementacion extends Conexion implements DAOarticulo {

    @Override
    public boolean Registrar(Articulo articulo) throws Exception {
        boolean respuesta = false;
        this.conectar();

        String sql = "INSERT INTO TBarticulo (titulo, descripcion, fecha, aceptado, idCliente) VALUES ('" 
                + articulo.getTitulo() + "', '" + articulo.getDescripcion() + "', '" + articulo.getFecha() + "', 0, " + articulo.getIdCliente() + ");";
        
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
    public boolean Modificar(int idArticulo) throws Exception {
        boolean respuesta = false;
        this.conectar();

        String sql = "UPDATE TBarticulo SET aceptado = 1 WHERE idArticulo = " + idArticulo + ";";

        Statement st;
        try {
            st = conexion.createStatement();
            int filas_afectadas = st.executeUpdate(sql);

            if (filas_afectadas > 0) {
                respuesta = true;
            } else {
                throw new Exception("No se encontró un artículo con ese ID");
            }
        } catch (SQLException ex) {
            throw new Exception("Error al Aceptar: " + ex.getMessage());
        }
        return respuesta;
    }

    
    @Override
    public boolean Eliminar(int idArticulo) {
        boolean respuesta = false;
        String sql = "DELETE FROM TBarticulo WHERE idArticulo = " + idArticulo + ";";

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
    public ArrayList<Articulo> Seleccionar() {
        ArrayList<Articulo> articulos = null;

        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM TBarticulo");

            articulos = new ArrayList<>();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Articulo art = new Articulo();
                art.setIdArticulo(rs.getInt("idArticulo"));
                art.setTitulo(rs.getString("titulo"));
                art.setDescripcion(rs.getString("descripcion"));
                art.setFecha(rs.getString("fecha"));
                art.setAceptado(rs.getBoolean("aceptado"));
                art.setIdCliente(rs.getInt("idCliente"));

                articulos.add(art);
            }

            rs.close();
            st.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        return articulos;
    }
    
    @Override
    public Articulo SeleccionarD(int idArticulo) throws SQLException {
    Articulo articulos = new Articulo();

    try {
        this.conectar();
        String sql = "SELECT a.idArticulo, a.titulo, a.descripcion, a.fecha, c.nombre AS nombreUsuario " +
                     "FROM TBarticulo a " +
                     "INNER JOIN TBcliente c ON a.idCliente = c.idCliente " +
                     "WHERE a.idArticulo = ?;";

        PreparedStatement st = this.conexion.prepareStatement(sql);
        st.setInt(1, idArticulo); // Evita inyección SQL

        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            articulos.setIdArticulo(rs.getInt("idArticulo"));
            articulos.setTitulo(rs.getString("titulo"));
            articulos.setDescripcion(rs.getString("descripcion"));
            articulos.setFecha(rs.getString("fecha"));
            articulos.setNombreUsuario(rs.getString("nombreUsuario")); // <-- Agregado

        }

        rs.close();
        st.close();
    } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
        this.cerrar();
    }

    return articulos;
}


}

