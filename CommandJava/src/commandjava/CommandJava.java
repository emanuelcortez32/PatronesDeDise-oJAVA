/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandjava;

import commandjava.commands.Cuenta;
import commandjava.commands.DepositarImpl;
import commandjava.commands.Invoker;
import commandjava.commands.RetirarImpl;

/**
 *
 * @author emanuel
 */
public class CommandJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuenta = new Cuenta(1,200);
        
        DepositarImpl opDepositar = new DepositarImpl(cuenta,100);
        RetirarImpl opRetirar = new RetirarImpl(cuenta,50);
        
        Invoker ivk = new Invoker();
        
        ivk.recibirOperacion(opDepositar);
        ivk.recibirOperacion(opRetirar);
        
        ivk.realizarOperaciones();
    }
    
}
