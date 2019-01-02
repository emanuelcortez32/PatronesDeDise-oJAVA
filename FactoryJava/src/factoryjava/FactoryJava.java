/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryjava;

import inter.IConexion;

/**
 *
 * @author emanuel
 */
public class FactoryJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConexionFabrica fabrica = new ConexionFabrica();

        IConexion cx1 = fabrica.getConexion("ORACLE");
        cx1.conectar();
        cx1.desconectar();

        IConexion cx2 = fabrica.getConexion("MYSQL");
        cx2.conectar();
        cx2.desconectar();

        IConexion cx3 = fabrica.getConexion("H2");
        cx3.conectar();
        cx3.desconectar();
    }

}
