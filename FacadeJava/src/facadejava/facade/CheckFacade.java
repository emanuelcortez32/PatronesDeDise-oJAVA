/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadejava.facade;

import facadejava.api.AvionAPI;
import facadejava.api.HotelAPI;

/**
 *
 * @author emanuel
 */
public class CheckFacade {

    private AvionAPI avionAPI;
    private HotelAPI hotelAPI;

    public CheckFacade() {
        avionAPI = new AvionAPI();
        hotelAPI = new HotelAPI();
    }

    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
        avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
        hotelAPI.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
    }
}
