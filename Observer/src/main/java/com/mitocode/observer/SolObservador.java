/**
 * 
 */
package com.mitocode.observer;

/**
 * @author BRYAN
 *
 */
public class SolObservador extends Observador {

	private double valorCambio = 3.25;
	
	public SolObservador(Subject sujeto) {
		super();
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}

	@Override
	public void actualizar() {
		System.out.println("PEN: " + (sujeto.getEstado() * valorCambio));
	}

}
