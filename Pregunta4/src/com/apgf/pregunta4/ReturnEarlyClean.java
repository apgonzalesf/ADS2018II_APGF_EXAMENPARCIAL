package com.apgf.pregunta4;

public class ReturnEarlyClean {
	private static final int NRO_MINIMO_CLASES_ASISTIDAS = 10;
	private static final int NOTA_MINIMA_PRACTICA = 13;

	public static void main(String[] args) {
		ReturnEarlyClean clean = new ReturnEarlyClean();  
		try {
			Alumno alumno = new Alumno();
			alumno.setNotaPracticas(11.0);
			alumno.setNotaExamenParcial(12.0); 
			alumno.setNroClasesAsistidas(15);
			boolean  apto   =  clean.aptoParaDarExamenFinal(alumno);	
			System.out.println("El alumno es apto para dar el examen final?"+ apto);
		} catch (Exception e) {
			System.out.println("El alumno no es apto para dar el examen final  : " + e.getMessage());
		}
		
		
	}

	private boolean aptoParaDarExamenFinal(Alumno alumno) throws AlumnoNoAptoException {
		if(alumno.getNotaExamenParcial()==null) {
			throw new AlumnoNoAptoException("Alumno no rindio examen parcial");		 
		}		 
		if(alumno.getNotaPracticas()<NOTA_MINIMA_PRACTICA) {
			return false ;
		}
		if(alumno.getNroClasesAsistidas()<NRO_MINIMO_CLASES_ASISTIDAS) {
			return false;
		} 
		return true;
		 
	} 
}
