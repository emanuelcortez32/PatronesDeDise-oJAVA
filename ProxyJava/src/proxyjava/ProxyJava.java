/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyjava;

import proxyjava.inter.ICuenta;
import proxyjava.inter.impl.CuentaBancoAImpl;
import proxyjava.model.Cuenta;
import proxyjava.proxy.CuentaProxy;

/**
 *
 * @author emanuel
 */
public class ProxyJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta c = new Cuenta(1,"Emanuel",100);
        
        ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoAImpl());
        
        cuentaProxy.mostrarSaldo(c);
        c = cuentaProxy.depositarDinero(c, 50);
        c = cuentaProxy.retirarDinero(c, 20);
        cuentaProxy.mostrarSaldo(c);
    }
    
}
