package Logica;

public class Celda {
	private Integer coordFila;
	private Integer coordColu;
	private Entidad entidad;
	private EntidadGrafica entGrafica;
	private Integer estado;
	
	public Celda() {
		this.coordFila = null;
		this.coordColu = null;
		this.entidad = new Entidad();
		this.entGrafica = new EntidadGrafica();
		this.estado = null;
	}
	
	public void setCoordFila(Integer v) {
		this.coordFila = v;
	}
	public void setCoordColu(Integer v) {
		this.coordColu = v;
	}
	public Integer getCoordFila() {
		return this.coordFila;
	}
	public Integer getCoordColu() {
		return this.coordColu;
	}
	public EntidadGrafica getEntidadGraf() {
		return this.entGrafica;
	}
	public Integer getEstado() {
		return this.estado;
	}
	public void setEstado(Integer v) {
		this.estado  = v;
	}
	
	public Entidad getEntidad() {
		return entidad;
	}

	public void setEntidad(Entidad entidad) {
		this.entidad = entidad;
	}

	public EntidadGrafica getEntGrafica() {
		return entGrafica;
	}

	public void setEntGrafica(EntidadGrafica entGrafica) {
		this.entGrafica = entGrafica;
	}
	public void setCelda(Integer fila,Integer colu, EntidadGrafica imag) {
		
	}
}