package com.mitocode.Prototype;

import com.mitocode.model.CuentaAHImpl;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Tipo Patron: CREACION
    	// Patron Prototype: Se basa en crear una instancia con los valores copiados de otra instancia.
        CuentaAHImpl cuentaAhorro = new CuentaAHImpl();
        cuentaAhorro.setMonto(600);
        
        CuentaAHImpl cuentaClonada = (CuentaAHImpl)cuentaAhorro.clonar();
		
        if (cuentaClonada != null) {
			System.out.println(cuentaClonada);
		}
        
        System.out.println(cuentaAhorro == cuentaClonada);
        
//      CuentaAHImpl cuentaClonada2 = cuentaAhorro;
//      cuentaClonada2.setMonto(200);
//
//		System.out.println(cuentaAhorro);
//		System.out.println(cuentaClonada2);
    }
}
