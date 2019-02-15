/**
 * 
 */
package com.mitocode.inter.impl;

import com.mitocode.inter.ICuenta;
import com.mitocode.model.Cuenta;

/**
 * @author User
 *
 */
public class CuentaBancoBImpl implements ICuenta{

	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		double saldo = cuenta.getSaldoInicial() - monto;
		cuenta.setSaldoInicial(saldo);
		System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
		return cuenta;
	}

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		double saldo = cuenta.getSaldoInicial() + monto + 0.2;
		cuenta.setSaldoInicial(saldo);
		System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
		return cuenta;
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
	}
	
}
