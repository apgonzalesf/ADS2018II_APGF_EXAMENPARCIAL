package org.apgf.pregunta5.liskovSubstitution;

public class Alumno {
	String nombre;
	String apellido;
	String codigo;
 
	 

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String obtenerDatos() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", codigo=" + codigo + "]";
	}
	 

}
