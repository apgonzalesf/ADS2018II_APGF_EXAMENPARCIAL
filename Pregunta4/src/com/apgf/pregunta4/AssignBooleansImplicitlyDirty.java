package com.apgf.pregunta4;

import java.io.IOException;

public class AssignBooleansImplicitlyDirty {
	public static void main(String[] args) throws IOException {
		Integer notaExamen = 10;
		Integer notaMinAprobar = 13;	
		boolean aprobado;		
		if(notaExamen>=notaMinAprobar) {
			aprobado = true;
		}else {
			aprobado=false ;
		}
		
		System.out.println("Alumando tiene nota " + notaExamen );
		System.out.println("El alumno ha aprobado ? " + aprobado );
		System.in.read();
	}

}
