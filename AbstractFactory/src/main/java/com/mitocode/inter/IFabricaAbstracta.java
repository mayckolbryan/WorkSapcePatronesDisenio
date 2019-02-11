/**
 * 
 */
package com.mitocode.inter;

/**
 * @author BRYAN
 *
 */
public interface IFabricaAbstracta {
	public IConexionBD getBD(String motor);
	public IConexionREST getREST(String area);
}
