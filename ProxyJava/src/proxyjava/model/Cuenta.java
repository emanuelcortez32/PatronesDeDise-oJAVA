/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyjava.model;

/**
 *
 * @author emanuel
 */
public class Cuenta {
    private int id;
    private String usuario;
    private double saldoInicial;

    public Cuenta(int id, String usuario, double saldoInicial) {
        this.id = id;
        this.usuario = usuario;
        this.saldoInicial = saldoInicial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
    
    
}
