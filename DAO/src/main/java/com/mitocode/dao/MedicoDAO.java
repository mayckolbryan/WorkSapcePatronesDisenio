/**
 * 
 */
package com.mitocode.dao;

import java.util.List;

import com.mitocode.model.Medico;

/**
 * @author BRYAN
 *
 */
public interface MedicoDAO extends CRUD<Medico>{
	void curar();
}
