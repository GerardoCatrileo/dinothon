package com.hackaton.dinothon.dinothon.entity;

public class Transporte {

	private int id_transporte;
	private String negocio;
	private String canal;
	private String patente;
	private int id_desp;
	
	public int getId_transporte() {
		return id_transporte;
	}

	public void setId_transporte(int id_transporte) {
		this.id_transporte = id_transporte;
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

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getId_desp() {
		return id_desp;
	}

	public void setId_desp(int id_desp) {
		this.id_desp = id_desp;
	}

	public Transporte() {
		// TODO Auto-generated constructor stub
	}

}
