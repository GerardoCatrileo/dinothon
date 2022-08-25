package com.hackaton.dinothon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hackaton.dinothon.entity.Despacho;
import com.hackaton.dinothon.service.DespachoService;



@Controller
@SessionAttributes("despacho")
public class FormController {

	@Autowired
	DespachoService despachoService;

	@GetMapping("/")
	public String index(Model model) {
		Despacho despacho = new Despacho();
		model.addAttribute("despacho", despacho);
		return "buscar";
	}
	
	@PostMapping("/buscar")
	public String buscar(Despacho despacho, Model model) {
		List<Despacho> despachos = despachoService.getDespachoByF12(despacho.getF12());
		if (despachos != null && despachos.size() == 0) {
			model.addAttribute("titulo", "El F12: "+despacho.getF12()+" no tiene registro");
			despacho = new Despacho();
			model.addAttribute("despacho",despacho);
		} else {
			for (Despacho desp : despachos) {
			}
		}
		return "f12";
	}


}
