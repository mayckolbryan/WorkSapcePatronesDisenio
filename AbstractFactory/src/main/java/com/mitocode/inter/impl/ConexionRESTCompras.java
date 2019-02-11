/**
 * 
 */
package com.mitocode.inter.impl;

import com.mitocode.inter.IConexionREST;

/**
 * @author BRYAN
 *
 */
public class ConexionRESTCompras implements IConexionREST {

	@Override
	public void leerURL(String url) {
		System.out.println("Conectándose a : " + url);
	}

}
