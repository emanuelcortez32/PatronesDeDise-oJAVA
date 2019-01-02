/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorjava;

import decoratorjava.decorador.BlindajeDecorador;
import decoratorjava.interf.ICuentaBancaria;
import decoratorjava.interf.impl.CuentaAhorro;
import decoratorjava.model.Cuenta;

/**
 *
 * @author emanuel
 */
public class DecoratorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta c = new Cuenta(1, "MitoCode");

        ICuentaBancaria cuenta = new CuentaAhorro();
        ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);

        //cuenta.abrirCuenta(c);
        cuentaBlindada.abrirCuenta(c);
    }

}
