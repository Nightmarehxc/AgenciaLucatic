package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UsuariosDTO;
import com.example.demo.interfaces.IUsuariosSERVICE;

@RestController
@RequestMapping("/api")
public class UsuariosController {

	@Autowired
	IUsuariosSERVICE usuariosSERVICE;

	@GetMapping("/usuarios")
	public List<UsuariosDTO> findAll(){
		return usuariosSERVICE.findAll();
	}
	
	@GetMapping("/get_usuario/{dni}")
	public UsuariosDTO get_usuario_by_dni(@PathVariable("dni") String dni){
		return usuariosSERVICE.get_usuario_by_dni(dni);
	}
	
	@PostMapping("/add_usuario")
	public void add_usuario(@RequestBody UsuariosDTO usuariosDTO) {
		usuariosSERVICE.add(usuariosDTO);
	}
	
	@DeleteMapping("/borrar_usuario/{dni}")
	public void borrar_usuario(@PathVariable("dni") String dni) {
		usuariosSERVICE.delete_by_dni(dni);
	}
}
