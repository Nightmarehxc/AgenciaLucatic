package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ViajeService;
import com.example.demo.util.Vuelos;
import org.springframework.ui.Model;

@Controller
@RequestMapping("viajes")
public class ViajeController {

	@Autowired
	private ViajeService viajeService;

	@RequestMapping()
	public String getMenu() {
		return "menu";
	}

	@RequestMapping("/vuelos")
	public String getAllVuelos(Model m) {
		List<Vuelos> vuelos = viajeService.getVuelos();
		m.addAttribute("vuelos", vuelos);
		return "flights";
	}
	
	@RequestMapping("/vuelos/crear")
	public String createVuelo(Model m) {
		m.addAttribute("vuelo", new Vuelos());
		return "add_flight";
	}
	
	@RequestMapping("/vuelos/guardar-vuelo")
	public String saveVuelo(Vuelos vuelo, Model m) {
		String res = viajeService.createVuelo(vuelo);
		if (res.equals("OK")) {
			m.addAttribute("mensaje", "Vuelo creado correctamente");
		} else {
			m.addAttribute("mensaje", "Error al crear el vuelo");
		}
		return res.equals("OK") ? getAllVuelos(m) : "add_flight";
	}
	
}
