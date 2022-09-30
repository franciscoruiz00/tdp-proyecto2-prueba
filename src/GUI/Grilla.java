package GUI;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Logica.Alimento;
import Logica.Celda;
import Logica.Entidad;
import Logica.EntidadGrafica;
import Logica.Fondo;
import Logica.Pared;
import Logica.PowerUp;

public class Grilla {

	private Celda tablero[][];
	private int cantFilas;
	private int cantColumnas;

	public Grilla (int filas,int columnas) {
		this.cantColumnas = 20;
		this.cantFilas = 20;
		tablero = new Celda [filas][columnas];

		for (int i = 0; i < cantFilas; i++) {
			for(int j = 0; j < cantColumnas; j++) {
				tablero[i][j] = new Celda(i,j);
			}
		}
	}

	public Celda getCelda(int i,int j) {
		if (i < 0 || i >= getCantFilas() || j < 0 || j >= getCantColu()) {
			return null;
		}
		else {
			return tablero[i][j];
		}
	}

	public Grilla cargarTablero(String nameArchivo) throws IOException {

		ArrayList<String> lineas = new ArrayList<String>();
		int ancho = 0;
		int alto = 0;

		//Lee cada linea del archivo en la  lista
		BufferedReader lector = new BufferedReader (new FileReader(nameArchivo));
		while (true) {
			String linea = lector.readLine();
			// no hay mas lineas a leer
			if (linea == null) {
				lector.close();	
				break;
			}

			//# = pared
			if (linea.startsWith("/")) {
				lineas.add(linea);
				ancho = Math.max(ancho,linea.length());
			}
		}
		alto = lineas.size();

		Grilla nuevoTablero = new Grilla(20,20);

		for(int i = 0; i < alto;i++) {
			String linea = (String) lineas.get(i);
			for(int j = 0; j < linea.length(); j++) {
				Celda c = nuevoTablero.getCelda(i, j);
				char ch = linea.charAt(j);
				//chequea si el char representa una entidad
				if ( ch == '#' ) {
						c.setEntidad(new Pared());
						c.setEntidadGrafica(new EntidadGrafica(c.getEntidad()));
				
				} else if( ch == 'P') {
						c.setEntidad(new PowerUp());
						c.setEntidadGrafica(new EntidadGrafica(c.getEntidad()));
				}
				else if( ch == 'A') {
						c.setEntidad(new Alimento());
						c.setEntidadGrafica(new EntidadGrafica(c.getEntidad()));
				}
				else if( ch == ' ') {
					c.setEntidad(new Fondo());
					c.setEntidadGrafica(new EntidadGrafica(c.getEntidad()));
			}
			}
		}
		return nuevoTablero;
	}
	public int getCantFilas() {
		return this.cantFilas;
	}

	public int getCantColu() {
		return this.cantColumnas;
	}
}
