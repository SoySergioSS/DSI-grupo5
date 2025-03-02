package DAO;

import Interfaces.DAOadministrador;
import Logica.Administrador;
import Logica.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DAOadministradorImplementacion extends Conexion implements DAOadministrador {

    @Override
    public int Seleccionar(Usuario administrador) throws Exception {
        int idAdministrador = -1;
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM TBusuario WHERE usuario = ? AND password = ?;");
            st.setString(1, administrador.getUsuario());
            st.setString(2, administrador.getPassword());
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String tipo = rs.getString("tipo");
                if (tipo.equals("Administrador")) {
                    idAdministrador = rs.getInt("idUsuario");
                }
            }
            rs.close();
            st.close();

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            this.cerrar();
        }
        return idAdministrador;
    }
    
    @Override
    public Administrador SeleccionarD(int idAdmin) throws SQLException {
        Administrador admin = null;

        try {
            this.conectar(); // Conectar a la BD
            PreparedStatement st = this.conexion.prepareStatement(
                "SELECT u.idUsuario, u.usuario, u.password, u.tipo " +
                "FROM TBusuario u " +
                "JOIN TBadministrador a ON u.idUsuario = a.idAdministrador " +
                "WHERE u.idUsuario = ? AND u.tipo = 'Administrador';"
            );
            st.setInt(1, idAdmin);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                admin = new Administrador();
                admin.setIdAdministrador(rs.getInt("idUsuario"));
                admin.setUsuario(rs.getString("usuario"));
                admin.setPassword(rs.getString("password"));
            }

            rs.close();
            st.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            this.cerrar(); // Cerrar conexión
        }
        return admin;
    }


}
