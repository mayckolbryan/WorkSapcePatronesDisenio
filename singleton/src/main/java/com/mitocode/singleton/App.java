package com.mitocode.singleton;

import com.mitocode.model.Conexion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Patron Singleton: Se basa en la reutilización de la instacia de los objetos 
    	//para disminuir la carga evitando generar mas espacios de memoria.
    	
    	//Instancia por constructor prohibido por ser private
//    	Conexion c1 = new Conexion();
        Conexion c = Conexion.getInstance();
        c.conectar();
        c.desconectar();
        
        boolean respuesta = c instanceof Conexion;
        System.out.println(respuesta);
    }
}
