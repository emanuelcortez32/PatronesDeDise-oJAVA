/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorjava.decorador;

import decoratorjava.interf.ICuentaBancaria;
import decoratorjava.model.Cuenta;

/**
 *
 * @author emanuel
 */
public class BlindajeDecorador extends CuentaDecorador{

    public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
        super(cuentaDecorada);
    }

    @Override
    public void abrirCuenta(Cuenta c) {
        cuentaDecorada.abrirCuenta(c);
        agregarBlindaje(c);
    }

    public void agregarBlindaje(Cuenta c) {
        System.out.println("Se agregó blindaje a la cuenta del cliente " + c.getCliente());
    }

}
