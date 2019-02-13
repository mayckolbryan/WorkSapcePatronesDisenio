/**
 * 
 */
package com.mitocode.model;

import com.mitocode.inter.ICuenta;

/**
 * @author User
 *
 */
public class CuentaAHImpl implements ICuenta {

	private String tipo;
	private double monto;
	
	public CuentaAHImpl() {
		super();
		tipo = "AHORRO";
	}
	
	@Override
	public ICuenta clonar() {
		CuentaAHImpl cuenta = null;
		try {
			cuenta = (CuentaAHImpl) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cuenta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "CuentaAHImpl [tipo=" + tipo + ", monto=" + monto + "]";
	}
	
}
