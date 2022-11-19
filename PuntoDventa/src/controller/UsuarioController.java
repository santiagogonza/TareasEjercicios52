
package controller;

import db.Conexion;
import entity.Usuario;
import java.sql.Connection;
import java.sql.Statement;

public class UsuarioController {
    private Connection connection;
    private Statement stm;
    // Crrear un registro en la base de datos
    public void crearRegistro(Usuario usuario) {
        try {
            Conexion conexion = new Conexion();
            connection = conexion.getConnection();
            String query = "INSERT INTO usuario(nombre, edad, telefono, direccion) values('"+usuario.getNombre()+"', 23, null, null)";
            stm = connection.createStatement();
            stm.execute(query);
            stm.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    /*public static void main(String[] args) {
        Usuario u = new Usuario();
        u.setNombre("Paco");
        
        new UsuarioController().crearRegistro(u);
    }*/
}
