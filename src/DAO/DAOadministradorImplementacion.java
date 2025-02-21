package DAO;

import Interfaces.DAOadministrador;
import Logica.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

}
