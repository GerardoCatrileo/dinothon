package com.hackaton.dinothon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;



@Controller
@SessionAttributes("usuario")
public class FormController {


	@GetMapping("/")
	public String form(Model model) {
		return "index";
	}


}
