/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Juan
 */
public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/ligasemillitas?serverTimezone=UTC";
    String user="root";
    String pass="1234";
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("¡Conexión exitosa!"); // Mensaje para verificar que la conexión se haya establecido correctamente
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al conectar a la base de datos: " + e.getMessage()); // Mensaje de error en caso de problemas
        }
        return con;
    }
}
