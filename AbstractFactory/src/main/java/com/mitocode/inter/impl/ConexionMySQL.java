/**
 * 
 */
package com.mitocode.inter.impl;

import com.mitocode.inter.IConexionBD;

/**
 * @author BRYAN
 *
 */
public class ConexionMySQL implements IConexionBD{
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionMySQL() {
		super();
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		System.out.println("Se conectó a MySQL.");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó a MySQL.");
	}
}
