/**
 * 
 */
package com.mitocode.inter.impl;

import com.mitocode.inter.IConexionBD;

/**
 * @author BRYAN
 *
 */
public class ConexionOracle implements IConexionBD{
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionOracle() {
		super();
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		System.out.println("Se conectó a Oracle.");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó a Oracle.");
	}
}
