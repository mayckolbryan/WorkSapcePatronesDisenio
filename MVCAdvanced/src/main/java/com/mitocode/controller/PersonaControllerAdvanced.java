/**
 * 
 */
package com.mitocode.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.mitocode.dao.PersonaDAOImpl;
import com.mitocode.model.Persona;
import com.mitocode.service.PersonaService;
import com.mitocode.service.PersonaServiceImpl;

/**
 * @author BRYAN
 *
 */
@ManagedBean(name="personaControllerAdvanced")
@ViewScoped
public class PersonaControllerAdvanced implements Serializable{
	
    //Patrones: MVC, DAO, Inyeccion de Dependencias y Fábrica.
	
	private List<Persona> lista;
	private PersonaService service;
	private String motor;
	
	public PersonaControllerAdvanced(){
		motor = "MYSQL";
		lista = new ArrayList<>();
		service = new PersonaServiceImpl(new PersonaDAOImpl(motor));
		this.listar();
	}
	
	public void seleccionar(String motor){
		service = new PersonaServiceImpl(new PersonaDAOImpl(motor));
		listar();
	}
	
	public void listar(){
		lista = service.listar();
	}
	
	public List<Persona> getLista() {
		return lista;
	}
	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}
}
