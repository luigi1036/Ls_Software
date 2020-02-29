
package servicios;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {

    public static String Url = "jdbc:mysql://localhost:3306/dragon_fenix"; //urle base de datos
    public static String Usuario = "root"; //usuario
    public static String Pass = "root"; //password

    public static Connection conectar() { //metodo conectar

        Connection cnx = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(Url, Usuario, Pass); //crear la conexion
            JOptionPane.showMessageDialog(null, "Conexion establecida");

        } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
            System.out.println("Error al Conectar" + ex);
        }
        return cnx;
    }

    public static void desconectar() {
        Connection cnx = null;
        if (cnx == null) {
            System.out.println("Conexion Terminada");
        }
    }

}
