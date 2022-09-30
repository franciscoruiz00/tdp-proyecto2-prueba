package GUI;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Logica.Celda;
import Logica.EntidadGrafica;
import Logica.Pared;

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

	public static void addEntidadG(Grilla g, EntidadGrafica ent,int fila,int col) {
		g.getCelda(fila, col).setEntidadGrafica(ent);

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
			if (linea.startsWith("#")) {
				lineas.add(linea);
				ancho = Math.max(ancho,linea.length());
			}
		}
		alto = lineas.size();

		Grilla nuevoTablero = new Grilla(ancho,alto);

		for(int i = 0; i < alto;i++) {
			String linea = (String) lineas.get(i);
			for(int j = 0; j < linea.length(); j++) {
				Celda c = nuevoTablero.getCelda(i, j);
				char ch = linea.charAt(j);
				//chequea si el char representa una entidad
				if ( ch == '#' ) {
						c.setEntidad(new Pared());
						EntidadGrafica entidadG = c.getEntidadGrafica();
						addEntidadG(nuevoTablero,entidadG, i, ch);
				} else if( ch == 'P') {

				}
				else if( ch == 'A') {

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
