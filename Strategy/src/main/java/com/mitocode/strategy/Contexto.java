/**
 * 
 */
package com.mitocode.strategy;

/**
 * @author BRYAN
 *
 */
public class Contexto {
	
	private IEstrategia estrategia;

	public Contexto(IEstrategia estrategia) {
		super();
		this.estrategia = estrategia;
	}
	
	public void ejecutar(){
		this.estrategia.analizar();
	}
}
