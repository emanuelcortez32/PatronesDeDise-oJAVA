/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerjava.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emanuel
 */
public class Subject {
    private List<Observador> observadores = new ArrayList<>();
    private int estado;
    
    public int getEstado(){
        return estado;
    }
    
    public void setEstado(int estado){
        this.estado = estado;
        notificarTodosObservadores();
    }
    
    public void agregar(Observador observador){
        this.observadores.add(observador);
    }
    
    public void notificarTodosObservadores(){
        this.observadores.forEach(x -> x.actualizar());
    }
}
