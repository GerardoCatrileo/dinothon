package com.hackaton.dinothon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackaton.dinothon.mapper.TransporteMapper;
import com.hackaton.dinothon.service.TransporteService;

@Service
public class TransporteServiceImpl implements TransporteService {
	
	@Autowired
	TransporteMapper transporteMapper;

	@Override
	public Integer buscaRuta(String patente) {
		return transporteMapper.buscaRuta(patente);
	}

}
