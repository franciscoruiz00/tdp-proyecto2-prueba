package Logica;

import javax.swing.ImageIcon;

public class EntidadGrafica {
	private ImageIcon grafico;
	private String[] images = {"/imagenes/#.png", "/imagenes/A.jpg", "/imagenes/P.jpg"} ;

	public EntidadGrafica() {
		this.grafico = new ImageIcon();
	}

	public ImageIcon getGrafico() {
		return this.grafico;
	}
	
	public void setGrafico(ImageIcon grafico) {
		this.grafico = grafico;
	}
	
	public String[] getImagenes() {
		return images;
	}
	
	public void setImagenes(String[] imagenes) {
		this.images = imagenes;
	}
}
