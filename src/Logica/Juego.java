package Logica;

import java.io.IOException;

import GUI.Grilla;

public class Juego {
	private Grilla miGrilla;
	private int cantFilas;
	private int cantColumnas;
	
	public Juego() {
		this.cantColumnas = 20;
		this.cantFilas = 20;
		this.miGrilla = new Grilla(cantFilas, cantColumnas);
		try {
			miGrilla.cargarTablero("Nivel1.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public int getCantFilas() {
		return this.cantFilas;
	}
	
	public int getCantColu() {
		return this.cantColumnas;
	}

	public Grilla getGrilla(){
		return miGrilla;
	}
}
