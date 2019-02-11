package com.mitocode.AbstractFactory;

import com.mitocode.inter.IConexionBD;
import com.mitocode.inter.IConexionREST;
import com.mitocode.inter.IFabricaAbstracta;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Patrón Fabrica Abstracta: Se basa en una clase fabrica de fabricas de objetos.
        IFabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
        IConexionBD cxBD1 = fabricaBD.getBD("MYSQL");
        
        cxBD1.conectar();
        
        IFabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
        IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");
        
        cxRS1.leerURL("https://www.youtube.com/watch?v=QmE-o5R7ZF4&index=4&list=PLvimn1Ins-41Uiugt1WbpyFo1XT1WOquL");
    }
}
