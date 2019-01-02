/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryjava;

import inter.FabricaAbstracta;
import inter.IConexionBD;
import inter.IConexionREST;
import inter.impl.ConexionRESTCompras;
import inter.impl.ConexionRESTNoArea;
import inter.impl.ConexionRESTVentas;

/**
 *
 * @author emanuel
 */
public class ConexionRESTFabrica implements FabricaAbstracta{

    @Override
    public IConexionREST getREST(String area) {
        if (area == null) {
            return new ConexionRESTNoArea();
        }
        if (area.equalsIgnoreCase("COMPRAS")) {
            return new ConexionRESTCompras();
        } else if (area.equalsIgnoreCase("VENTAS")) {
            return new ConexionRESTVentas();
        }

        return new ConexionRESTNoArea();
    }

    @Override
    public IConexionBD getBD(String motor) {
        return null;
    }
}
