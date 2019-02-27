/**
 * 
 */
package com.mitocode.dao;

import java.util.ArrayList;
import java.util.List;

import com.mitocode.model.Persona;

/**
 * @author BRYAN
 *
 */
public class PersonaDAOImpl implements PersonaDAO {

	@Override
	public List<Persona> listar() {
		List<Persona> lista = new ArrayList<Persona>();
		
		Persona persona = new Persona();
		persona.setId(1);
		persona.setNombre("Juan");
		persona.setEdad(22);
		
		lista.add(persona);
		
		persona = new Persona();
		persona.setId(2);
		persona.setNombre("Ana");
		persona.setEdad(18);
		
		lista.add(persona);
		
		return lista;		
	}

}
