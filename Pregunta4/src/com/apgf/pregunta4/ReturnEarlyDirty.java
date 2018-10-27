package com.apgf.pregunta4;

public class ReturnEarlyDirty {
	public static void main(String[] args) {
		ReturnEarlyDirty dirty = new ReturnEarlyDirty();  
		try {
			Alumno alumno = new Alumno();
			alumno.setNotaPracticas(15.0);
			alumno.setNotaExamenParcial(11.0); 
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
