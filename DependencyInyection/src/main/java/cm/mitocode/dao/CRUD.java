/**
 * 
 */
package cm.mitocode.dao;

import java.util.List;

/**
 * @author BRYAN
 *
 */
public interface CRUD<T> {
	List<T> listarTodos();
	T leerPorId(int id);
	void registrar(T persona);
	void actualizar(T persona);
	void eliminar(int id);
}
