package com.mitocode;

import com.mitocode.commands.Cuenta;
import com.mitocode.commands.DepositarImpl;
import com.mitocode.commands.Invoker;
import com.mitocode.commands.RetirarImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Tipo Patron: COMPORTAMIENTO
        //Patron Command: Se basa en la encapsulacion de una peticion bajo un metodo.
    	
    	Cuenta cuenta = new Cuenta(1, 400);
    	
    	DepositarImpl opDepositar = new DepositarImpl(cuenta, 300);
    	RetirarImpl opRetirar = new RetirarImpl(cuenta, 100);
    	
    	Invoker inv = new Invoker();
    	inv.recibirOperacion(opDepositar);
    	inv.recibirOperacion(opRetirar);
    	
    	inv.realizarOperaciones();
    }
}
