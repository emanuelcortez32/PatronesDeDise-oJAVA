/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypejava;

import prototypejava.model.CuentaAHImpl;

/**
 *
 * @author emanuel
 */
public class PrototypeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaAHImpl cuentaAhorro = new CuentaAHImpl();
        cuentaAhorro.setMonto(200);

        CuentaAHImpl cuentaAhorro2 = new CuentaAHImpl();

        CuentaAHImpl cuentaClonada = (CuentaAHImpl) cuentaAhorro.clonar();

        System.out.println(cuentaAhorro);
        System.out.println(cuentaAhorro2);

        if (cuentaClonada != null) {
            System.out.println(cuentaClonada);
        }
        System.out.println(cuentaClonada == cuentaAhorro);
    }

}
