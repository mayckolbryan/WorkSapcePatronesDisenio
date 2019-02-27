package com.mitocode;

import com.mitocode.strategy.AntivirusSimple;
import com.mitocode.strategy.Contexto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Tipo Patron: COMPORTAMIENTO
        //Patron Strategy: Se basa en definir familias de algoritmos, encapsularlos. Permite que los algoritmos sean independientes.
    	
    	Contexto contexto = new Contexto(new AntivirusSimple());
    	contexto.ejecutar();
    }
}
