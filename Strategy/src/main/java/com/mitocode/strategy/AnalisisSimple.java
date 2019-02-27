/**
 * 
 */
package com.mitocode.strategy;

/**
 * @author BRYAN
 *
 */
public abstract class AnalisisSimple implements IEstrategia {

	public void analizar(){
		iniciar();
		saltarZip();
		detener();
	}
	
	abstract void iniciar();
	abstract void saltarZip();
	abstract void detener();
}
