package com.hackaton.dinothon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackaton.dinothon.entity.Despacho;
import com.hackaton.dinothon.mapper.DespachoMapper;
import com.hackaton.dinothon.service.DespachoService;

@Service
public class DespachoServiceImpl implements DespachoService {
	
	@Autowired
	DespachoMapper despachoMapper;

	
	@Override
	public List<Despacho> getDespachoByF12(String f12) {
		return despachoMapper.getDespachoByF12(f12);
	}
}
