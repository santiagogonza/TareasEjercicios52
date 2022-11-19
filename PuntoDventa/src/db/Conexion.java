package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private Connection connection = null;
    private String url;
    private String user;
    private String pwd;

    public Conexion() {
       
    }

    public Connection getConnection() {      
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/puntoventa", "root", "GONZALO10_santy");
           System.out.println("conexion exitósa");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    
    public static void main(String[] args) {
        new Conexion().getConnection();
    }
}
