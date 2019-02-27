package com.mitocode;

import com.mitocode.dao.PersonaDAO;
import com.mitocode.dao.PersonaDAOImpl;
import com.mitocode.model.Persona;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Tipo Patron: -
        //Patron DAO: Se basa en separar las API's de acceso a datos de bajo nivel o las operaciones de servicios de negocios de alto nivel.
    	//También se basa en abstraer la lógica de acceso de una clase determinada.
    	
    	PersonaDAO dao = new PersonaDAOImpl();
    	for (Persona persona : dao.listarTodos()) {
			System.out.println(persona.getNombre());
		}
    	
    	dao.registrar(new Persona(3, "Raúl"));
    }
}
