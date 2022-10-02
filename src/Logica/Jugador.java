package Logica;

public class Jugador {
	private int puntaje;
	private String nombre;
	
	public Jugador(String n) {
		setPuntaje(0);
		setNombre(n);
	}
	
	public void aumentarPuntaje(int p) {
		setPuntaje(getPuntaje() + p);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
}
