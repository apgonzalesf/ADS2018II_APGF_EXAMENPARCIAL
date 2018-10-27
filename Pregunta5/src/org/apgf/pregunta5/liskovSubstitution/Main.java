package org.apgf.pregunta5.liskovSubstitution;

public class Main {

	public static void main(String[] args) {
	 
		AlumnoPostgrado alumno = new AlumnoPostgrado();
		alumno.setApellido ("Gonzales");
		alumno.setNombre("Alejandra");
		alumno.setMaestria("ISW");
		
		AlumnoRegister register = new AlumnoRegister() ;
		register.registrar(alumno);
		

	}

}
