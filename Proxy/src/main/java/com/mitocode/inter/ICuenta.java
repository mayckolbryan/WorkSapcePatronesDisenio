/**
 * 
 */
package com.mitocode.inter;

import com.mitocode.model.Cuenta;

/**
 * @author User
 *
 */
public interface ICuenta {
	
	public Cuenta retirarDinero(Cuenta cuenta, double monto);
	public Cuenta depositarDinero(Cuenta cuenta, double monto);
	public void mostrarSaldo(Cuenta cuenta);
}
