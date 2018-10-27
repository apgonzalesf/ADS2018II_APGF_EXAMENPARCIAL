package com.apgf.pregunta4;

import java.io.IOException;

public class AssignBooleansImplicitlyClean {
	
	private static final Integer NOTA_MINIMA_APROBAR = 13;
	public static void main(String[] args) throws IOException {
		Integer notaExamen = 10;		
		boolean aprobado =notaExamen>=NOTA_MINIMA_APROBAR;  
		System.out.println("Alumando tiene nota " + notaExamen );
		System.out.println("El alumno ha aprobado ? " + aprobado );
		System.in.read();
	}
}
