package com.hackaton.dinothon.entity;

public class Despacho {

	private Integer id_desp;
	private String negocio;
	private String canal;
	private String norden;
	private String f12;
	private Integer id_direc;
	private Integer id_transp;
	private Integer id_zona;
	


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

	public String getF12() {
		return f12;
	}

	public void setF12(String f12) {
		this.f12 = f12;
	}

	public int getId_direc() {
		return id_direc;
	}

	public void setId_direc(int id_direc) {
		this.id_direc = id_direc;
	}

	public int getId_transp() {
		return id_transp;
	}

	public void setId_transp(int id_transp) {
		this.id_transp = id_transp;
	}

	public int getId_zona() {
		return id_zona;
	}

	public void setId_zona(int id_zona) {
		this.id_zona = id_zona;
	}

	public Despacho() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId_desp() {
		return id_desp;
	}

	public void setId_desp(Integer id_desp) {
		this.id_desp = id_desp;
	}

}
