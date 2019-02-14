/**
 * 
 */
package com.mitocode.model;

/**
 * @author User
 *
 */
public class Cuenta {
	private int id;
	private String cliente;
	
	public Cuenta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cuenta(int id, String cliente) {
		super();
		this.id = id;
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", cliente=" + cliente + "]";
	}
}
