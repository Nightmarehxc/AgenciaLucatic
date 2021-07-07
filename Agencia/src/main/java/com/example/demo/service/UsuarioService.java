package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UsuarioService {

	@Autowired
	private RestTemplate restTemplate;
	
	public String urlMicroProductorUsuarios = "http://agencia-micro-usuarios";
}
