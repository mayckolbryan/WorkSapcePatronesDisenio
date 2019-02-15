package com.mitocode;

import com.mitocode.inter.ICuenta;
import com.mitocode.inter.impl.CuentaBancoAImpl;
import com.mitocode.inter.impl.CuentaBancoBImpl;
import com.mitocode.model.Cuenta;
import com.mitocode.proxy.CuentaProxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Tipo Patron: ESTRUCTURAL
        //Patron Proxy: Se basa en crear un evoltoreo que permita tener el acceso al metodo final que deseamos manipular, encapsulandolo.
        
    	Cuenta cuenta = new Cuenta(1, "Javicho", 22.2);
    	
    	ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
    	cuentaProxy.mostrarSaldo(cuenta);
    	cuenta = cuentaProxy.retirarDinero(cuenta, 6.0);
    	cuenta = cuentaProxy.depositarDinero(cuenta, 7.9);
    	cuentaProxy.mostrarSaldo(cuenta);
    }
}
