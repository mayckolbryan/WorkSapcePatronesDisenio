/**
 * 
 */
package com.mitocode.strategy;

/**
 * @author BRYAN
 *
 */
public class AntivirusSimple extends AnalisisSimple {

	@Override
	void iniciar() {
		System.out.println("Antivirus Simple - Análisis simple iniciado");
	}

	@Override
	void saltarZip() {
		try {
			System.out.println("Analizando...");
			Thread.sleep(2500);
			System.out.println("No se pudo analizar archivos con extension '.zip'");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	void detener() {
		System.out.println("Antivirus Simple - Análisis simple finalizado");
	}

}
