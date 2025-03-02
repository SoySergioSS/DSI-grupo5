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


/*package DAO;

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

//    public void conectar() throws Exception{
//        try{
//            conexion = DriverManager.getConnection(DB_URL, User, Password);
//            Class.forName(JDBC_Driver);
//        }catch(ClassNotFoundException | SQLException e){
//            JOptionPane.showMessageDialog(null, e.getMessage());
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
}//no borres xq yo uso sql server :v

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
}*/

