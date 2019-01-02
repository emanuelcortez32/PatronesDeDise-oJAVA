/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementojava.memento;

import java.util.ArrayList;

/**
 *
 * @author emanuel
 */
public class Caretaker {
    private ArrayList<Memento> mementos = new ArrayList<>();
    
    public void addMemento(Memento m){
        this.mementos.add(m);
    }
    
    public Memento getMemento(int index){
        return this.mementos.get(index);
    }
}
