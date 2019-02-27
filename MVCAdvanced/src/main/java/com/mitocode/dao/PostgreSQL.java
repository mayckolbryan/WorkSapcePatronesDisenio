/**
 * 
 */
package com.mitocode.dao;

/**
 * @author BRYAN
 *
 */
public class PostgreSQL implements Conexion {

	@Override
	public void conectar() {
		System.out.println("Conexion a PostgreSQL");
	}

}
