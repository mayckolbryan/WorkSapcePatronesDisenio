package com.mitocode;

import com.mitocode.memento.Caretaker;
import com.mitocode.memento.Juego;
import com.mitocode.memento.Originator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Tipo Patron: COMPORTAMIENTO
        //Patron Memento: Se basa en restablecer el estado de un objeto antes de una operacion.
    	
    	String nombreJuego = "Crash Bandicoop";
    	
    	Juego juego = new Juego();
    	juego.setNombre(nombreJuego);
    	juego.setCheckpoint(1);
    	
    	Caretaker caretaker = new Caretaker();
    	Originator originator = new Originator();
    	
    	juego = new Juego();
    	juego.setNombre(nombreJuego);
    	juego.setCheckpoint(2);
    	originator.setEstado(juego);
    	
    	juego = new Juego();
    	juego.setNombre(nombreJuego);
    	juego.setCheckpoint(3);
    	originator.setEstado(juego);
    	
    	caretaker.addMemento(originator.guardar());	//Estado posicion 0
    	
    	juego = new Juego();
    	juego.setNombre(nombreJuego);
    	juego.setCheckpoint(4);
    	originator.setEstado(juego);
    	
    	caretaker.addMemento(originator.guardar());	//Estado posicion 1
    	
    	juego = new Juego();
    	juego.setNombre(nombreJuego);
    	juego.setCheckpoint(5);
    	originator.setEstado(juego);
    	
    	originator.restaurar(caretaker.getMemento(0));
    	
    	juego = originator.getEstado();
    	System.out.println(juego);
    }
}
