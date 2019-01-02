/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

/**
 *
 * @author emanuel
 */
public interface FabricaAbstracta {

    IConexionBD getBD(String motor);

    IConexionREST getREST(String area);
}
