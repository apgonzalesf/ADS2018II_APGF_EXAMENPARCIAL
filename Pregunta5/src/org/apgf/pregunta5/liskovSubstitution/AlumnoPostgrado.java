package org.apgf.pregunta5.liskovSubstitution;

public class AlumnoPostgrado extends Alumno {
	String maestria;

	public void setMaestria(String maestria) {
		this.maestria = maestria;
	}
	
	 
	
	@Override
	public String obtenerDatos() {
		return "AlumnoPostgrado [maestria=" + maestria + ", nombre=" + nombre + ", apellido=" + apellido + ", codigo="
				+ codigo + "]";
	}



	 

	 

}
