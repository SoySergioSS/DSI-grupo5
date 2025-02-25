package DAO;

import Interfaces.DAOtienda;
import Logica.Tienda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DAOtiendaImplementacion extends Conexion implements DAOtienda {

    @Override
    public boolean Registrar(Tienda tienda) {
        boolean respuesta = false;

        String sql = "INSERT INTO TBtienda (nombre, link, idAdministrador) VALUES ('" + tienda.getNombre() + "', '" + tienda.getLink() + "', " + tienda.getIdAdministrador() + ");";

        Statement st;
        try {
            this.conectar();
            st = conexion.createStatement();
            int filas_afectadas = st.executeUpdate(sql);

            if (filas_afectadas > 0) {
                respuesta = true;
            }
        } catch (Exception ex) {
            System.err.println("Error: " + ex);
        }

        return respuesta;
    }

    @Override
    public boolean Modificar(Tienda tienda){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Eliminar(int idTienda){
        boolean respuesta = false;

        String sql = "DELETE FROM TBtienda WHERE idTienda = " + idTienda + ";";

        Statement st;
        try {
            this.conectar();
            st = conexion.createStatement();
            int filas_afectadas = st.executeUpdate(sql);

            if (filas_afectadas > 0) {
                respuesta = true;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

        return respuesta;
    }

    @Override
    public ArrayList<Tienda> Seleccionar(){
        ArrayList<Tienda> tiendas = null;

        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT idTienda, nombre, link FROM TBtienda");

            tiendas = new ArrayList<>();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Tienda tienda = new Tienda();
                tienda.setIdTienda(rs.getInt("idTienda"));
                tienda.setNombre(rs.getString("nombre"));
                tienda.setLink(rs.getString("link"));

                tiendas.add(tienda);
            }

            rs.close();
            st.close();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

        return tiendas;
    }

}
