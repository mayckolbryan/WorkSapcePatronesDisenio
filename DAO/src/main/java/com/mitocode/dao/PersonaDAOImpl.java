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
	public List<Persona> listarTodos() {
		List<Persona> lista = new ArrayList<Persona>();
		Persona persona = new Persona();
		persona.setId(1);
		persona.setNombre("Stuart");
		
		lista.add(persona);
		
		persona = new Persona();
		persona.setId(2);
		persona.setNombre("Juan");
		
		lista.add(persona);
		
		return lista;
	}

	@Override
	public Persona leerPorId(int id) {
		return null;
	}

	@Override
	public void registrar(Persona persona) {
		System.out.println("Persona " + persona.getNombre() + " registrada");
	}

	@Override
	public void actualizar(Persona persona) {
		System.out.println("Persona " + persona.getNombre() + " actualizada");
	}

	@Override
	public void eliminar(int id) {
		System.out.println("Id " + id + " eliminado");
	}

}
