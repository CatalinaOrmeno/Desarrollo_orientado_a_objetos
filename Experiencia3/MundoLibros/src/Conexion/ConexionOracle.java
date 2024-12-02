package Conexion;
import java.sql.*;
/**
 *
 * @author Catalina
 */
public class ConexionOracle {
    Connection cone;
    
    public void conectar(){
        try {
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String user = "libreria";
            String password = "123";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cone = DriverManager.getConnection(url, user, password);
            System.out.println("CONECTADO!");
        } catch (Exception e) {
            System.err.println("ERROR: "+e.getMessage());
        }
    }
    public ConexionOracle() {
        conectar();
    }

    public Connection getCone() {
        return cone;
    }    
}
