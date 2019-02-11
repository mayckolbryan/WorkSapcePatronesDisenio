/**
 * 
 */
package com.mitocode.inter.impl;

import com.mitocode.inter.IConexionBD;

/**
 * @author BRYAN
 *
 */
public class ConexionPostgreSQL implements IConexionBD{
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionPostgreSQL() {
		super();
		this.host = "localhost";
		this.puerto = "5433";
		this.usuario = "postgres";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		System.out.println("Se conectó a PostgreSQL.");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó a PostgreSQL.");
	}
}
