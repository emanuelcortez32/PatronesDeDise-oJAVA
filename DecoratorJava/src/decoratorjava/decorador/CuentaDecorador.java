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
public abstract class CuentaDecorador implements ICuentaBancaria{

    protected ICuentaBancaria cuentaDecorada;

    public CuentaDecorador(ICuentaBancaria cuentaDecorada) {
        this.cuentaDecorada = cuentaDecorada;
    }

    @Override
    public void abrirCuenta(Cuenta c) {
        this.cuentaDecorada.abrirCuenta(c);
    }
}
