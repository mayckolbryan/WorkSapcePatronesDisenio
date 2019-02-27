/**
 * 
 */
package com.mitocode.observer;

/**
 * @author BRYAN
 *
 */

public class PesoMXObservador extends Observador {

	private double valorCambio = 19.07;
	
	public PesoMXObservador(Subject sujeto) {
		super();
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}

	@Override
	public void actualizar() {
		System.out.println("MX: " + (sujeto.getEstado() * valorCambio));
	}

}
