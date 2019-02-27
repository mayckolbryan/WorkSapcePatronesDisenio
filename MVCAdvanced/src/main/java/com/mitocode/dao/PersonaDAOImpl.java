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
	private Conexion conexion;
	private String motor;
	
	public PersonaDAOImpl(String motor){
		this.motor = motor;
		if (motor.equals("MYSQL")) {
			conexion = new MySQL();
		}else if (motor.equals("POSTGRESQL")) {
			conexion = new PostgreSQL();
		}
		
		conexion.conectar();
	}

	@Override
	public List<Persona> listar() {
		List<Persona> lista = new ArrayList<Persona>();
		
		if (this.motor.equals("MYSQL")) {

			Persona persona = new Persona();
			persona.setId(1);
			persona.setNombre("Juan MYSQL");
			persona.setEdad(22);
			
			lista.add(persona);
			
			persona = new Persona();
			persona.setId(2);
			persona.setNombre("Ana MYSQL");
			persona.setEdad(18);
			
			lista.add(persona);
		}else if (this.motor.equals("POSTGRESQL")) {

			Persona persona = new Persona();
			persona.setId(1);
			persona.setNombre("Enrique POSTGRESQL");
			persona.setEdad(22);
			
			lista.add(persona);
			
			persona = new Persona();
			persona.setId(2);
			persona.setNombre("Jimena POSTGRESQL");
			persona.setEdad(18);
			
			lista.add(persona);
		}
		
		return lista;		
	}

}
