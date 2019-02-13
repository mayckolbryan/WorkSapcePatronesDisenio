package com.mitocode.Factory;

import com.mitocode.inter.IConexionBD;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Tipo Patron: CREACION
    	//Patrón Fabrica: Se basa en el envio de un valor a una clase fabrica 
    	//para que te devuelva una instancia de un objeto en base a este valor, sin mostrar su lógica.
    	
        ConexionFabrica fabrica = new ConexionFabrica();
        IConexionBD cx1 = fabrica.getConexion("ORACLE");
        cx1.conectar();
        cx1.desconectar();
        
        IConexionBD cx2 = fabrica.getConexion("MYSQL");
        cx2.conectar();
        cx2.desconectar();
        
        IConexionBD cx3 = fabrica.getConexion("H2");
        cx3.conectar();
        cx3.desconectar();
    }
}
