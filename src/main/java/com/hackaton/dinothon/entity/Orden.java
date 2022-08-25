package com.hackaton.dinothon.entity;

public class Orden {

	private int id_orden;
	private String norden;
	private String negocio;
	private String canal;
	private String num_orden;
	private int id_cliente;
	private int id_desp;

	public int getId_orden() {
		return id_orden;
	}

	public void setId_orden(int id_orden) {
		this.id_orden = id_orden;
	}

	public String getNorden() {
		return norden;
	}

	public void setNorden(String norden) {
		this.norden = norden;
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

	public String getNum_orden() {
		return num_orden;
	}

	public void setNum_orden(String num_orden) {
		this.num_orden = num_orden;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_desp() {
		return id_desp;
	}

	public void setId_desp(int id_desp) {
		this.id_desp = id_desp;
	}

	public Orden() {
		// TODO Auto-generated constructor stub
	}

}
