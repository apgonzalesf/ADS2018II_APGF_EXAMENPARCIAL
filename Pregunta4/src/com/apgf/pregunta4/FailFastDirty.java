package com.apgf.pregunta4;

public class FailFastDirty {
	public static void main(String[] args) {
		FailFastDirty dirty = new FailFastDirty();  
		try {
			Alumno alumno = new Alumno();
			alumno.setNotaPracticas(15.0);
			alumno.setNotaExamenParcial(null); 
			alumno.setNroClasesAsistidas(15);
			boolean  apto   =  dirty.aptoParaDarExamenFinal(alumno);	
			System.out.println("El alumno es apto para dar el examen final?"+ apto);
		} catch (Exception e) {
			System.out.println("Error");
		}
		
		
	}

	private boolean aptoParaDarExamenFinal(Alumno alumno) {
		boolean apto = true;
		if(alumno.getNotaPracticas()<13) {
			apto = apto && false;
		}
		if(alumno.getNotaExamenParcial()==null) {
			apto = apto && false;
		}
		
		if(alumno.getNroClasesAsistidas()<10) {
			apto = apto && false;
		} 
		return apto;
		 
	} 
}
