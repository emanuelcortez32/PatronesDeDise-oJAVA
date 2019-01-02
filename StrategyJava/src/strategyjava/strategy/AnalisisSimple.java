/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyjava.strategy;

/**
 *
 * @author emanuel
 */
public abstract class AnalisisSimple implements IEstrategia{
    
    @Override
    public void analizar() {
        iniciar();
        saltarZip();
        detener();
    }
    
    abstract void iniciar();
    abstract void saltarZip();
    abstract void detener();
   
}
