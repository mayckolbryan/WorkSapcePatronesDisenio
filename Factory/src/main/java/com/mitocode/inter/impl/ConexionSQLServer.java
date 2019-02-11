/**
 * 
 */
package com.mitocode.inter.impl;

import com.mitocode.inter.IConexion;

/**
 * @author BRYAN
 *
 */
public class ConexionSQLServer implements IConexion{
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionSQLServer() {
		super();
		this.host = "localhost";
		this.puerto = "1433";
		this.usuario = "root";
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
