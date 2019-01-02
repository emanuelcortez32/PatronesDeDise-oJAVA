/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author emanuel
 */
public class Conexion {
    
    //Declaracion
    private static Conexion instancia;
    //private static Conexion instancia = new Conexion();
    
    //Para evitar instanciar mediante operador "new" usamos un constructor privado
    private Conexion(){
        
    }
    
    //Para obtener la instancia unicamente por este metodo
    //Notese la palabra reservada "static" hace posible el acceso mediante Clase.metodo
    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        
        return instancia;
    }
    
    //Metodos de prueba
    public void conectar(){
        System.out.println("Conectado a la BD");
    }
    
    public void desconectar(){
        System.out.println("Desconectado de la BD");
    }
}
