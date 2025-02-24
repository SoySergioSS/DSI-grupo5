package DAO;

import Interfaces.DAOcliente;
import Logica.Cliente;
import Logica.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAOclienteImplementacion extends Conexion implements DAOcliente{

    @Override
    public boolean Registrar(Cliente cliente) throws Exception {
        boolean respuesta = false;
        String sqlUsuario = "INSERT INTO TBusuario (usuario, password, tipo) VALUES (?, ?, 'Cliente')";
        String sqlCliente = "INSERT INTO TBcliente (idCliente, nombre, telefono, distrito, correo) VALUES (?, ?, ?, ?, ?)";

        try {
            this.conectar();
            // Preparar la consulta para insertar en TBusuario
            PreparedStatement psUsuario = conexion.prepareStatement(sqlUsuario, Statement.RETURN_GENERATED_KEYS);
            psUsuario.setString(1, cliente.getUsuario());
            psUsuario.setString(2, cliente.getPassword());

            int rowsAffectedUsuario = psUsuario.executeUpdate();

            if (rowsAffectedUsuario > 0) {
                // Obtener el ID generado automáticamente
                ResultSet keyGenerada = psUsuario.getGeneratedKeys();
                if (keyGenerada.next()) {
                    int lastId = keyGenerada.getInt(1); // Este es el idUsuario generado

                    // Preparar la consulta para insertar en TBcliente
                    PreparedStatement psCliente = conexion.prepareStatement(sqlCliente);
                    psCliente.setInt(1, lastId); // idCliente
                    psCliente.setString(2, cliente.getNombre());
                    psCliente.setString(3, cliente.getTelefono());
                    psCliente.setString(4, cliente.getDistrito());
                    psCliente.setString(5, cliente.getCorreo());

                    int rowsAffectedCliente = psCliente.executeUpdate();
                    if (rowsAffectedCliente > 0) {
                        respuesta = true;
                    }
                }
            }
        } catch (SQLException ex) {
            
            System.err.println("Error: " + ex.getMessage());
        }
        return respuesta;
    }

    @Override
    public boolean Modificar(Cliente cliente) throws Exception {
        boolean respuesta = false;
        String sqlCliente = "UPDATE TBcliente SET nombre = ?, telefono = ?, distrito = ?, correo = ? WHERE idCliente = ?";
        String sqlUsuario = "UPDATE TBusuario SET usuario = ?, password = ? WHERE idUsuario = ?";

        PreparedStatement psCliente = null;
        PreparedStatement psUsuario = null;

        try {
            this.conectar();
            // Preparar y ejecutar la actualización para TBcliente
            psCliente = conexion.prepareStatement(sqlCliente);
            psCliente.setString(1, cliente.getNombre());
            psCliente.setString(2, cliente.getTelefono());
            psCliente.setString(3, cliente.getDistrito());
            psCliente.setString(4, cliente.getCorreo());
            psCliente.setInt(5, cliente.getIdCliente());
            int filasCliente = psCliente.executeUpdate();

            // Preparar y ejecutar la actualización para TBusuario
            psUsuario = conexion.prepareStatement(sqlUsuario);
            psUsuario.setString(1, cliente.getUsuario());
            psUsuario.setString(2, cliente.getPassword());
            psUsuario.setInt(3, cliente.getIdCliente());
            int filasUsuario = psUsuario.executeUpdate();

            // Validar si ambas actualizaciones se ejecutaron correctamente
            if (filasCliente > 0 && filasUsuario > 0) {
                System.out.println("Datos actualizados correctamente");
                respuesta = true;
            } else {
                System.err.println("No se pudieron actualizar los datos");
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        } finally {
            try {
                if (psCliente != null) psCliente.close();
                if (psUsuario != null) psUsuario.close();
                if (conexion != null) conexion.close();
            } catch (SQLException ex) {
                System.err.println("Error: " + ex.getMessage());
            }
        }
        return respuesta;
    }

    @Override
    public int Seleccionar(Usuario cliente) throws SQLException{
        int idCliente = -1;
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT idUsuario, tipo FROM TBusuario WHERE usuario = ? AND password = ?;");
            st.setString(1, cliente.getUsuario());
            st.setString(2, cliente.getPassword());
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String tipo = rs.getString("tipo");
                if (tipo.equals("Cliente")) {
                    idCliente = rs.getInt("idUsuario");
                }
            }
            rs.close();
            st.close();

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            this.cerrar();
        }
        return idCliente;
    }
    @Override
    public Cliente SeleccionarD(int idCliente) throws SQLException{

        Cliente cliente = null;
        try {
            this.conectar(); // Conectar a la BD
            PreparedStatement st = this.conexion.prepareStatement(
                "SELECT c.idCliente, c.nombre, c.telefono, c.distrito, c.correo, " +
                "u.usuario, u.password, u.tipo " +
                "FROM TBcliente c " +
                "JOIN TBusuario u ON c.idCliente = u.idUsuario " +
                "WHERE c.idCliente = ?;"
            );
            st.setInt(1, idCliente);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setDistrito(rs.getString("distrito"));
                cliente.setCorreo(rs.getString("correo"));

                // Atributos heredados de Usuario
                cliente.setUsuario(rs.getString("usuario"));
                cliente.setPassword(rs.getString("password"));
            }

            rs.close();
            st.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            this.cerrar(); // Cerrar conexión
        }
        return cliente;
    }
    
}
