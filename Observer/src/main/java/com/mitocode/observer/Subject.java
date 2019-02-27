/**
 * 
 */
package com.mitocode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BRYAN
 *
 */
public class Subject {
	
	private List<Observador> observadores = new ArrayList<>();
	private int estado;
	
	public int getEstado() {
		return estado;
	}
	
	public void setEstado(int estado) {
		this.estado = estado;
		notificarTodosObservadores();
	}
	
	public void agregar(Observador observador){
		observadores.add(observador);
	}
	
	public void notificarTodosObservadores(){
		for (Observador observador : observadores) {
			observador.actualizar();
		}
	}
}
