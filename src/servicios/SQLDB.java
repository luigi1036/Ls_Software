/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Formularios.Menu;
import static java.lang.Compiler.disable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIS SERNA
 */
public class SQLDB {

    Connection cnx; 
    
    public SQLDB() {
        cnx = Conexion.conectar();
    } 
    
    public Connection getConnection() {
        return cnx;
    }

    public Connection getCnx() {
        return cnx;
    } 
}
