package codigos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {
    private static String base="prueba";
    private static String usr="root";
    private static String pass="mysql123";
    private static String url="jdbc:mysql://localhost:3306/"+base;
public Connection getConexion(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=(Connection) DriverManager.getConnection(url, usr, pass);
        System.out.println("conectado");
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    return con;
}
private Connection con=null;

void conectar(){
getConexion();
}
    public static void main(String[] args) {
        conexion a=new conexion();
        a.conectar();
    }

}
