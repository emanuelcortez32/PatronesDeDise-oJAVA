/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerjava.observer;

/**
 *
 * @author emanuel
 */
public class PesoARGObservador extends Observador{
    private double valorCambio = 29.86;
    
    public PesoARGObservador(Subject sujeto){
       this.sujeto = sujeto;
       this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("ARG: " + (this.sujeto.getEstado() * this.valorCambio));
    }
    
    
}
