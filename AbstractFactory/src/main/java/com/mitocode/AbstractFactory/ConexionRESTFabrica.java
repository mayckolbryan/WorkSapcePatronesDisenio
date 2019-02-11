/**
 * 
 */
package com.mitocode.AbstractFactory;

import com.mitocode.inter.IConexionBD;
import com.mitocode.inter.IConexionREST;
import com.mitocode.inter.IFabricaAbstracta;
import com.mitocode.inter.impl.ConexionMySQL;
import com.mitocode.inter.impl.ConexionOracle;
import com.mitocode.inter.impl.ConexionPostgreSQL;
import com.mitocode.inter.impl.ConexionRESTCompras;
import com.mitocode.inter.impl.ConexionRESTNoArea;
import com.mitocode.inter.impl.ConexionRESTVentas;
import com.mitocode.inter.impl.ConexionSQLServer;
import com.mitocode.inter.impl.ConexionVacia;

/**
 * @author BRYAN
 *
 */
public class ConexionRESTFabrica implements IFabricaAbstracta{
	
	@Override
	public IConexionBD getBD(String motor) {
		return null;
	}
	
	@Override
	public IConexionREST getREST(String area) {
		if (area == null) {
			return new ConexionRESTNoArea();
		}
		if (area.equalsIgnoreCase("COMPRAS")) {
			return new ConexionRESTCompras();
		}else if (area.equalsIgnoreCase("VENTAS")) {
			return new ConexionRESTVentas();
		}
		return new ConexionRESTNoArea();
	}
}
