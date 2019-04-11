package co.com.totto.main;

public class ClassModel {
	private String nombreEsperado;
	private String cantidadEsperada;
	private String nombreObtenido;
	private String cantidadObtenida;
	
	
	public ClassModel(String nombreEsperado, String cantidadEsperada, String nombreObtenido,String cantidadObtenida) {
		this.nombreEsperado=nombreEsperado;
		this.cantidadEsperada= cantidadEsperada;
		this.nombreObtenido = nombreObtenido;
		this.cantidadObtenida = cantidadObtenida;
	}


	public String getNombreEsperado() {
		return nombreEsperado;
	}


	public String getCantidadEsperada() {
		return cantidadEsperada;
	}


	public String getNombreObtenido() {
		return nombreObtenido;
	}


	public String getCantidadObtenida() {
		return cantidadObtenida;
	}



}
