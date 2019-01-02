/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyjava;

import strategyjava.strategy.AntivirusAvanzado;
import strategyjava.strategy.AntivirusSimple;
import strategyjava.strategy.Contexto;

/**
 *
 * @author emanuel
 */
public class StrategyJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Contexto contexto = new Contexto(new AntivirusSimple());
        Contexto contexto = new Contexto(new AntivirusAvanzado());
        contexto.ejecutar();
    }
    
}
