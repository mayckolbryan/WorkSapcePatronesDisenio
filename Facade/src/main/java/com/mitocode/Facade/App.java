package com.mitocode.Facade;

import com.mitocode.patron.CheckFacade;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Tipo Patron: ESTRUCTURAL
        //Patron Facade: Se basa en ocultar la implementacion compleja de metodos utilizando clases intermediarias.
    	
    	CheckFacade cliente = new CheckFacade();
    	cliente.buscar("02/01/2019", "02/02/2019", "Lima", "Cancun");
    }
}
