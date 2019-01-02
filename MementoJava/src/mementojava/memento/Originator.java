/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementojava.memento;

/**
 *
 * @author emanuel
 */
//CLASE QUE SABE COMO GUARDAR EL OBJETO
public class Originator {
    private Juego estado;

    public Juego getEstado() {
        return estado;
    }

    public void setEstado(Juego estado) {
        this.estado = estado;
    }
    
    public Memento guardar(){
        return new Memento(estado);
    }
    
    public void restaurar(Memento m){
        this.estado = m.getEstado();
    }
}
