package com.hackaton.dinothon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hackaton.dinothon.entity.Despacho;
import com.hackaton.dinothon.entity.Orden;
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
		List<Orden> ordenes = despachoService.getDespachoByF12(despacho.getF12());
		if (ordenes != null && ordenes.size() == 0) {
			model.addAttribute("titulo", "El F12: "+despacho.getF12()+" no tiene registro");
			Orden orden = new Orden();
			model.addAttribute("orden",orden);
		} else {
			Orden orden = ordenes.get(0);
			if (orden.getEstadoF12() != null && "0".equals(orden.getEstadoF12())) {
				orden.setEstadoF12("PENDIENTE DE ENTREGA");
			}else {
				orden.setEstadoF12("ENTREGADO");
			}
				
			model.addAttribute("titulo", "Los datos del despacho son:");
			model.addAttribute("orden",orden);
		}
		return "f12";
	}
	
	@PostMapping("/entregar")
	public String entregarOC(Orden oc, Model model) { 
		try {
			despachoService.actualizaDespachoByF12(oc.getF12());
			List<Orden> ordenes = despachoService.getDespachoByF12(oc.getF12());
			if (ordenes != null && ordenes.size() == 0) {
				model.addAttribute("titulo", "El F12: "+oc.getF12()+" no tiene registro");
				Orden orden = new Orden();
				model.addAttribute("orden",orden);
			} else {
				Orden orden = ordenes.get(0);
				if (orden.getEstadoF12() != null && "0".equals(orden.getEstadoF12())) {
					orden.setEstadoF12("PENDIENTE DE ENTREGA");
				}else {
					orden.setEstadoF12("ENTREGADO");
				}
					
				model.addAttribute("titulo", "Los datos del despacho son:");
				model.addAttribute("orden",orden);
			}
			return "f12";
		} catch (Exception e) {
			model.addAttribute("titulo", "Error al actulizar el F12: "+oc.getF12()+", favor reintentar");
			return "f12";
		}
		
	}


}
