/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonjava;

import model.Conexion;

/**
 *
 * @author emanuel
 */
public class SingletonJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instancia por constructor prohibido por ser privado
        //Conexion c = new Conexion();
        Conexion c = Conexion.getInstance();
        
        c.conectar();
        c.desconectar();
        
        boolean rpta = c instanceof Conexion;
        System.out.println(rpta);
    }
    
}
