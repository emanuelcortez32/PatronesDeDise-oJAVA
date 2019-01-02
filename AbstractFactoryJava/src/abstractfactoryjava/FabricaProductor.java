/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryjava;

import inter.FabricaAbstracta;

/**
 *
 * @author emanuel
 */
public class FabricaProductor {

    public static FabricaAbstracta getFactory(String tipoFabrica) {

        if (tipoFabrica.equalsIgnoreCase("BD")) {
            return new ConexionBDFabrica();

        } else if (tipoFabrica.equalsIgnoreCase("REST")) {
            return new ConexionRESTFabrica();
        }

        return null;
    }

}
