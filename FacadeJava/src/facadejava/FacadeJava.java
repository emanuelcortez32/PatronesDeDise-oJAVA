/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadejava;

import facadejava.facade.CheckFacade;

/**
 *
 * @author emanuel
 */
public class FacadeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CheckFacade cliente1 = new CheckFacade();
        cliente1.buscar("02/07/2018", "08/07/2018", "Lima", "Cancún");

        CheckFacade cliente2 = new CheckFacade();
        cliente2.buscar("02/07/2018", "08/07/2018", "Lima", "Quito");
    }

}
