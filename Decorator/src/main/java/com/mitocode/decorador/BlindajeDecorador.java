/**
 * 
 */
package com.mitocode.decorador;

import com.mitocode.interf.ICuentaBancaria;
import com.mitocode.model.Cuenta;

/**
 * @author User
 *
 */
public class BlindajeDecorador extends CuentaDecorador{

	public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
		super(cuentaDecorada);
	}
	
	@Override
	public void abrirCuenta(Cuenta c) {
		this.cuentaDecorada.abrirCuenta(c);
		agregarBlindaje(c);
	}
	
	public void agregarBlindaje(Cuenta c){
		System.out.println("Se agregó blindaje a la cuenta del cliente: " + c.getCliente());
	}
}
