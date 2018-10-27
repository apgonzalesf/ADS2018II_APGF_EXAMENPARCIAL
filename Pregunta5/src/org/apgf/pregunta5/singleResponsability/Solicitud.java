package org.apgf.pregunta5.singleResponsability;

import java.util.Date;

public class Solicitud {
	String nombreSolicitante ;
	Date fechaSolicitud;
	String detalle ;
	SolicitudEstado estado;
	String revisor;
	public String getNombreSolicitante() {
		return nombreSolicitante;
	}
	public void setNombreSolicitante(String nombreSolicitante) {
		this.nombreSolicitante = nombreSolicitante;
	}
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public SolicitudEstado getEstado() {
		return estado;
	}
	public void setEstado(SolicitudEstado estado) {
		this.estado = estado;
	}
	public String getRevisor() {
		return revisor;
	}
	public void setRevisor(String revisor) {
		this.revisor = revisor;
	}
	
	

}
