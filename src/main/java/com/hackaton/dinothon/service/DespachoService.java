package com.hackaton.dinothon.service;

import java.util.List;

import com.hackaton.dinothon.entity.Orden;


public interface DespachoService {
	
	public List<Orden> getDespachoByF12 (String f12);
	public void actualizaDespachoByF12(String f12);

}
