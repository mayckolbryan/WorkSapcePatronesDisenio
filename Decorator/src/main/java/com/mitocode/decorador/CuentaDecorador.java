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
public abstract class CuentaDecorador implements ICuentaBancaria{
	protected ICuentaBancaria cuentaDecorada;

	public CuentaDecorador(ICuentaBancaria cuentaDecorada) {
		super();
		this.cuentaDecorada = cuentaDecorada;
	}

	@Override
	public void abrirCuenta(Cuenta c) {
		this.cuentaDecorada.abrirCuenta(c);
	}
	
}
