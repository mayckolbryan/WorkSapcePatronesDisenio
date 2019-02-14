/**
 * 
 */
package com.mitocode.interf.impl;

import com.mitocode.interf.ICuentaBancaria;
import com.mitocode.model.Cuenta;

/**
 * @author User
 *
 */
public class CuentaAhorro implements ICuentaBancaria{

	@Override
	public void abrirCuenta(Cuenta c) {
		System.out.println("-------------------------------");
		System.out.println("Se abrió una Cuenta Ahorro");
		System.out.println("Cliente: " + c.getCliente());
	}

}
