package com.hackaton.dinothon.entity;

import java.util.Date;

public class Notificacion {

	private int id_notificacion;
	private String negocio;
	private String canal;
	private String norden;
	private String frecuencia_notif;
	private Date fecha_notif;
	private String id_mensaje;
	private int id_zona;
	
	public int getId_notificacion() {
		return id_notificacion;
	}

	public void setId_notificacion(int id_notificacion) {
		this.id_notificacion = id_notificacion;
	}

	public String getNegocio() {
		return negocio;
	}

	public void setNegocio(String negocio) {
		this.negocio = negocio;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getNorden() {
		return norden;
	}

	public void setNorden(String norden) {
		this.norden = norden;
	}

	public String getFrecuencia_notif() {
		return frecuencia_notif;
	}

	public void setFrecuencia_notif(String frecuencia_notif) {
		this.frecuencia_notif = frecuencia_notif;
	}

	public Date getFecha_notif() {
		return fecha_notif;
	}

	public void setFecha_notif(Date fecha_notif) {
		this.fecha_notif = fecha_notif;
	}

	public String getId_mensaje() {
		return id_mensaje;
	}

	public void setId_mensaje(String id_mensaje) {
		this.id_mensaje = id_mensaje;
	}

	public int getId_zona() {
		return id_zona;
	}

	public void setId_zona(int id_zona) {
		this.id_zona = id_zona;
	}

	public Notificacion() {
		// TODO Auto-generated constructor stub
	}

}
