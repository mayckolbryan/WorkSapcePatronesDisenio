/**
 * 
 */
package com.mitocode.commands;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BRYAN
 *
 */
public class Invoker {
	
	private List<IOperacion> operaciones = new ArrayList<>();
	
	public void recibirOperacion(IOperacion operacion){
		this.operaciones.add(operacion);
	}
	
	public void realizarOperaciones(){
		for (IOperacion operacion : operaciones) {
			operacion.execute();
		}
		this.operaciones.clear();
	}
}
