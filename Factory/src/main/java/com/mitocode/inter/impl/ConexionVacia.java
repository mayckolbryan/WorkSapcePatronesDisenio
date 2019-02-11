/**
 * 
 */
package com.mitocode.inter.impl;

import com.mitocode.inter.IConexion;

/**
 * @author BRYAN
 *
 */
public class ConexionVacia implements IConexion {
	@Override
	public void conectar() {
		System.out.println("No se especificó proveedor.");
	}
	
	@Override
	public void desconectar() {
		System.out.println("No se especificó proveedor.");
	}

}
