/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerjava;

import observerjava.observer.PesoARGObservador;
import observerjava.observer.PesoMXObservador;
import observerjava.observer.SolObservador;
import observerjava.observer.Subject;

/**
 *
 * @author emanuel
 */
public class ObserverJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Subject subject = new Subject();
        
        new SolObservador(subject);
        new PesoMXObservador(subject);
        new PesoARGObservador(subject);
        
        System.out.println("Si desea cambiar 10 dolares obtendra: ");
        subject.setEstado(10);
        System.out.println("***************************");
        System.out.println("Si desea cambiar 100 dolares obtendra: ");
        subject.setEstado(100);
    }
    
}
