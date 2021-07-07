package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.UsuarioService;
import com.example.demo.util.Usuarios;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping()
	public String getUsuarios(Model m) {
		m.addAttribute("usuarios", usuarioService.list_usuarios());
		return "users";
	}
	
	@RequestMapping("/detalle/{dni}")
	public String getUsuarioDetail(@PathVariable("dni") String dni, Model m) {
		m.addAttribute("usuarioDTO", usuarioService.find_by_dni(dni));
		m.addAttribute("hotelDTO", null);
		m.addAttribute("vueloDTO", null);
		return "user_detail";
	}
	
	@RequestMapping("/crear")
	public String crearUsuario(Model m) {
		m.addAttribute("usuario", new Usuarios());
		return "add_user";
	}
	

	@RequestMapping("/grabar_usuario")
	public String grabar_usuario(Model m, Usuarios usuario) {
		usuarioService.grabar_usuario(usuario);
		m.addAttribute("mensaje", "Usuario dado de alta correctamente");
		m.addAttribute("usuario", new Usuarios());
		return "add_user";
	}
	
	@RequestMapping("/borrar/{dni}")
	public String borrarUsuario(@PathVariable("dni") String dni, Model m) {
		usuarioService.borrar_usuario(dni);
		m.addAttribute("usuarios", usuarioService.list_usuarios());
		return "users";
	}
}
