package com.hackaton.dinothon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackaton.dinothon.entity.Orden;
import com.hackaton.dinothon.mapper.DespachoMapper;
import com.hackaton.dinothon.service.DespachoService;

@Service
public class DespachoServiceImpl implements DespachoService {
	
	@Autowired
	DespachoMapper despachoMapper;

	
	@Override
	public List<Orden> getDespachoByF12(String f12) {
		return despachoMapper.getDespachoByF12(f12);
	}


	@Override
	public void actualizaDespachoByF12(String f12) {
		despachoMapper.actualizaDespachoByF12(f12);
		
	}
}
