package com.mitocode;

import com.mitocode.decorador.BlindajeDecorador;
import com.mitocode.interf.ICuentaBancaria;
import com.mitocode.interf.impl.CuentaAhorro;
import com.mitocode.model.Cuenta;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Tipo Patron: ESTRUCTURAL
        //Patron Decorator: Se basa en agregar funcionalidades a un objeto existente sin modificar su estructura.
    	Cuenta c = new Cuenta(1, "Juan");
    	
    	ICuentaBancaria cuenta = new CuentaAhorro();
    	BlindajeDecorador cuentaBlindada = new BlindajeDecorador(cuenta);
    	
    	cuentaBlindada.abrirCuenta(c);
    }
}
