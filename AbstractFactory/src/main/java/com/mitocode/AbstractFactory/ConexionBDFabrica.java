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
import com.mitocode.inter.impl.ConexionSQLServer;
import com.mitocode.inter.impl.ConexionVacia;

/**
 * @author BRYAN
 *
 */
public class ConexionBDFabrica implements IFabricaAbstracta{
	
	@Override
	public IConexionBD getBD(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		}else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		}else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		}else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}
		return new ConexionVacia();
	}
	
	@Override
	public IConexionREST getREST(String motor) {
		return null;
	}
}
