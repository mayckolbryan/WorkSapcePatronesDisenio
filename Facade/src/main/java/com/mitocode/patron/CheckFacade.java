/**
 * 
 */
package com.mitocode.patron;

import com.mitocode.api.AvionAPI;
import com.mitocode.api.HotelAPI;

/**
 * @author User
 *
 */
public class CheckFacade {
	private AvionAPI avionAPI;
	private HotelAPI hotelAPI;
	
	public CheckFacade(){
		avionAPI = new AvionAPI();
		hotelAPI = new HotelAPI();
	}
	
	public void buscar(String fechaEntrada, String fechaSalida, String origen, String destino){
		avionAPI.buscarVuelos(fechaEntrada, fechaSalida, origen, destino);
		hotelAPI.buscarHoteles(fechaEntrada, fechaSalida, origen, destino);
	}
}
