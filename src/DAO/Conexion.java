package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    protected Connection conexion;
    
    private final String JDBC_Driver = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/attempt1";
    
    private final String User = "root";
    private final String Password = "sergio";
    
//    public void conectar() throws Exception{
//        try{
//            conexion = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=attempt1;user=koji;password=koji;encrypt=false;loginTimeout=30;");
//            Class.forName(JDBC_Driver);
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos");
//        }
//    }
    
    public void conectar() throws Exception {
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // Asegúrate de que este es el driver correcto
        conexion = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=attempt1;user=koji;password=koji;encrypt=false;loginTimeout=30;");
    } catch (Exception e) {
        e.printStackTrace(); // Muestra el error en la consola
        throw new Exception("Error al conectar con la base de datos", e); // Lanza la excepción en lugar de mostrar el mensaje
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
