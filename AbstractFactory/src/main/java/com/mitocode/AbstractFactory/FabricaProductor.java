/**
 * 
 */
package com.mitocode.AbstractFactory;

import com.mitocode.inter.IFabricaAbstracta;

/**
 * @author BRYAN
 *
 */
public class FabricaProductor {
	public static IFabricaAbstracta getFactory(String tipoFabrica) {
		if (tipoFabrica.equalsIgnoreCase("BD")) {
			return new ConexionBDFabrica();
		}else if (tipoFabrica.equalsIgnoreCase("REST")) {
			return new ConexionRESTFabrica();
		}
		return null;
	}
}
