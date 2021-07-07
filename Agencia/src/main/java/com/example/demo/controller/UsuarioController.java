package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.UsuarioService;

@Controller
@RequestMapping("usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping()
	public String getUsuarios(Model m) {
		List<String> usuariosList = new ArrayList<String>();
		m.addAttribute("usuarios", usuariosList);
		return "users";
	}
	
	@RequestMapping("/detalle/{idUsuario}")
	public String getUsuarioDetail(@PathVariable("idUsuario") String idUsuario, Model m) {
		m.addAttribute("usuarioDTO", null);
		m.addAttribute("hotelDTO", null);
		m.addAttribute("vueloDTO", null);
		return "user_detail";
	}
}
