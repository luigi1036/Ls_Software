/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Formularios.Login;
import Formularios.Menu;


/**
 *
 * @author LUIS SERNA
 */
public class main {
    
    public static void main(String[] args){
        Login.main(args);
        Menu menu=new Menu();
        menu.setVisible(true);
    }
    
}
