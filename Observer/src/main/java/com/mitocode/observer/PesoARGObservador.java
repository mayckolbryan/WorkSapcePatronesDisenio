/**
 * 
 */
package com.mitocode.observer;

/**
 * @author BRYAN
 *
 */

public class PesoARGObservador extends Observador {

	private double valorCambio = 29.86;
	
	public PesoARGObservador(Subject sujeto) {
		super();
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}

	@Override
	public void actualizar() {
		System.out.println("ARG: " + (sujeto.getEstado() * valorCambio));
	}

}
