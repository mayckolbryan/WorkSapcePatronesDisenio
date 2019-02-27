/**
 * 
 */
package com.mitocode.strategy;

/**
 * @author BRYAN
 *
 */
public class AntivirusAvanzado extends AnalisisAvanzado {

	@Override
	void iniciar() {
		System.out.println("Antivirus Avanzado - Análisis avanzado iniciado");
	}

	@Override
	void analizarMemoria() {
		try {
			System.out.println("Analizando Memoria RAM...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	void analizarKeyloggers() {
		try {
			System.out.println("Analizando en busca de keyloggers...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	void analizarRootKits() {
		try {
			System.out.println("Analizando en busca de RootKits...");
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	void descomprimirZip() {
		try {
			System.out.println("Analizando archivos zip...");
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	void detener() {
		System.out.println("Antivirus Avanzado - Análisis avanzado finalizado");
	}

}
