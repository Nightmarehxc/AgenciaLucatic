package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.util.Usuarios;

@Service
public class UsuarioService {

	@Autowired
	private RestTemplate restTemplate;
	
	public String urlMicroProductorUsuarios = "http://agencia-micro-usuarios";


	public List<Usuarios> list_usuarios() {
		return Arrays.asList(restTemplate.getForObject(urlMicroProductorUsuarios + "/api/usuarios", Usuarios[].class));
	}
	
	public Usuarios find_by_dni(String dni) {
		return restTemplate.getForObject(urlMicroProductorUsuarios + "/api/get_usuario/{dni}", Usuarios.class, dni);
	}
	
	public void grabar_usuario(Usuarios usuario) {
		restTemplate.postForObject(urlMicroProductorUsuarios + "/api/add_usuario", usuario, Usuarios.class);
	}
	
	public void borrar_usuario(String dni) {
		restTemplate.delete(urlMicroProductorUsuarios + "/api/borrar_usuario/{dni}", dni);
	}
}
