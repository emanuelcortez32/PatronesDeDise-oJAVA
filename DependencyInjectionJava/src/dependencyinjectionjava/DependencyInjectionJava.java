/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjectionjava;

import dependencyinjectionjava.dao.CRUD;
import dependencyinjectionjava.dao.ConexionMySQL;
import dependencyinjectionjava.dao.ConexionPostgre;
import dependencyinjectionjava.dao.IConexion;
import dependencyinjectionjava.dao.PersonaDAO;
import dependencyinjectionjava.dao.PersonaDAOImpl;

/**
 *
 * @author emanuel
 */
public class DependencyInjectionJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IConexion cx1 = new ConexionMySQL("mitocode","1234","localhost");
        IConexion cx2 = new ConexionPostgre("mitocode","1234","192.168.0.1");
        
        PersonaDAO dao = new PersonaDAOImpl();
        dao.setConexion(cx1);
        dao.listarTodos();
        
    }
    
}
