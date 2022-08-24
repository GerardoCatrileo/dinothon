package com.hackaton.dinothon.dinothon.entity;

public class Cliente {

	private int id_cliente;
	private String negocio;
	private String canal;
	private String nombre;
	private String email;
	private String celular;
	
	public int getId_cliente() {
		return id_cliente;
	}



	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
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



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getCelular() {
		return celular;
	}



	public void setCelular(String celular) {
		this.celular = celular;
	}



	public Cliente() {
		// TODO Auto-generated constructor stub
	}

}
