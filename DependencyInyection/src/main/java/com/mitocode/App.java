package com.mitocode;

import cm.mitocode.dao.ConexionMySQL;
import cm.mitocode.dao.ConexionPostgreSQL;
import cm.mitocode.dao.IConexion;
import cm.mitocode.dao.PersonaDAO;
import cm.mitocode.dao.PersonaDAOImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Tipo Patron: -
        //Patron Inyeccion de Dependencias: Se basa en suministrar objetos a una clase en lugar de ser la propia clase 
    	//la que cree dichos objetos, permite desacoplar el codigo y no depender de una instancia en particular.
    	
    	IConexion conexion1 = new ConexionMySQL("Luis", "123", "localhost");
    	PersonaDAO dao1 = new PersonaDAOImpl(conexion1);
    	
    	IConexion conexion2 = new ConexionPostgreSQL("Diego", "987", "192.167.2.3");
    	PersonaDAO dao2 = new PersonaDAOImpl(conexion2);
    	
    	dao1.listarTodos();
    	dao2.listarTodos();
    }
}
