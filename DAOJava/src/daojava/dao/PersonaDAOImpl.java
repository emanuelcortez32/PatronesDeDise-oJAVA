/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daojava.dao;

import daojava.model.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emanuel
 */
public class PersonaDAOImpl implements PersonaDAO{

    @Override
    public List<Persona> listarTodos() {
        List<Persona> lista = new ArrayList<>();
        Persona per = new Persona();
        per.setId(1);
        per.setNombres("Emanuel");
        
        lista.add(per);
        
        per = new Persona();
        per.setId(2);
        per.setNombres("Alexis");
        
        lista.add(per);
        
        return lista;
    }

    @Override
    public Persona leerPorId(int id) {
        //logica
        return null;
    }

    @Override
    public void registrar(Persona persona) {
        System.out.println("Persona " + persona.getNombres() + " registrada");
    }

    @Override
    public void actualizar(Persona persona) {
        System.out.println("Persona " + persona.getNombres() + " actualizada");
    }

    @Override
    public void eliminar(int id) {
        System.out.println("id " + id + " eliminado");
    }
    
}
