package com.hackaton.dinothon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hackaton.dinothon.entity.Despacho;



@Controller
@SessionAttributes("despacho")
public class FormController {



	@GetMapping("/")
	public String index(Model model) {
		Despacho despacho = new Despacho();
		model.addAttribute("despacho", despacho);
		return "buscar";
	}
	
	@PostMapping("/buscar")
	public String buscar(Model model) {
		
		return "buscar";
	}


}
