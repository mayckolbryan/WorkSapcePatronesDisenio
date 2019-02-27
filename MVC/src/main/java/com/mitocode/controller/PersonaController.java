/**
 * 
 */
package com.mitocode.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.mitocode.dao.PersonaDAOImpl;
import com.mitocode.model.Persona;

/**
 * @author BRYAN
 *
 */
@ManagedBean(name="personaController")
@ViewScoped
public class PersonaController implements Serializable{
	
    //Patron de Arquitectura MVC: Se basa en separar capas segun el contexto. 
	//-Capa de Modelo: Contiene la lógica y los POJOS.
	//-Capa de Visualizacion: Contiene la vistas que visualizara el cliente, y que muestra los datos del modelo.
	//-Capa de Controlador: Intermediador que mantiene separado la capa de Vista y Modelo.
	
	private List<Persona> lista;
	private PersonaDAOImpl dao;
	
	public PersonaController(){
		lista = new ArrayList<Persona>();
		dao = new PersonaDAOImpl();
		this.listar();
	}
	
	public void listar(){
		lista = dao.listar();
	}
	
	public List<Persona> getLista() {
		return lista;
	}
	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}
	public PersonaDAOImpl getDao() {
		return dao;
	}
	public void setDao(PersonaDAOImpl dao) {
		this.dao = dao;
	}
}
