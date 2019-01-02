/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daojava;

import daojava.dao.PersonaDAO;
import daojava.dao.PersonaDAOImpl;
import daojava.model.Persona;

/**
 *
 * @author emanuel
 */
public class DAOJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaDAO dao = new PersonaDAOImpl();
        
        dao.listarTodos().forEach(x -> System.out.println(x.getNombres()));
        
        Persona per = new Persona();
        per.setId(5);
        per.setNombres("Cortez Mercado");
        dao.registrar(per);
        dao.actualizar(per);
        dao.eliminar(per.getId());
    }
    
}
