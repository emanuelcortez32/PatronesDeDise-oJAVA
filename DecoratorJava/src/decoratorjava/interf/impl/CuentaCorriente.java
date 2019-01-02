/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorjava.interf.impl;

import decoratorjava.interf.ICuentaBancaria;
import decoratorjava.model.Cuenta;

/**
 *
 * @author emanuel
 */
public class CuentaCorriente implements ICuentaBancaria{

    @Override
    public void abrirCuenta(Cuenta c) {
        System.out.println("-------------------------");
        System.out.println("Se abrió una cuenta Corriente");
        System.out.println("Cliente: " + c.getCliente());
    }
}
