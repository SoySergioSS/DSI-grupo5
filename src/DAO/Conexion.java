package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    protected Connection conexion;
    
    private final String JDBC_Driver = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/attempt1"; //cambia el nombre de tu base de datos
    
    private final String User = "root"; //cambialo a tu usuario
    private final String Password = "sergio"; //cambialo a tu contraseña
    
    public void conectar() throws Exception{
        try{
            conexion = DriverManager.getConnection(DB_URL, User, Password);
            Class.forName(JDBC_Driver);
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void cerrar() throws SQLException{
        if(conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }
    
    public Connection getConexion() {
        return this.conexion;
    }
}
