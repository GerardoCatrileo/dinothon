package com.hackaton.dinothon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hackaton.dinothon.entity.Transporte;
import com.hackaton.dinothon.service.TransporteService;



@Controller
@SessionAttributes("ruta")
public class RutaController {

	@Autowired
	TransporteService transporteService;

	@GetMapping("/VerRuta")
	public String index(Model model) {
		Transporte transporte = new Transporte();
		model.addAttribute("transporte", transporte);
		
		return "VerRuta";
	}
	
	@PostMapping("/buscarPatente")
	public String buscaRuta(Transporte transporte, Model model) {
	Integer count = transporteService.buscaRuta(transporte.getPatente());
	if(count != 0) {
		model.addAttribute("error","Patente encontrada");
	}else {
		model.addAttribute("error","Favor validar los datos de busqueda!");
	}
		
	return "VerRuta";
	}
	

}
