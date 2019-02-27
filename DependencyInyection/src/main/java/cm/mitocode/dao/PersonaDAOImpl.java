/**
 * 
 */
package cm.mitocode.dao;

import java.util.ArrayList;
import java.util.List;

import com.mitocode.model.Persona;

/**
 * @author BRYAN
 *
 */
public class PersonaDAOImpl implements PersonaDAO {
	/*Patron Inyeccion de Dependencia*/
	private IConexion coneixon;
	
	public PersonaDAOImpl(IConexion conexion) {
		super();
		this.coneixon = conexion;
	}
	/*Patron Inyeccion de Dependencia*/

	@Override
	public List<Persona> listarTodos() {
		this.coneixon.conectar();
		System.out.println("Listando...");
		System.out.println(this.coneixon);
		return null;
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
