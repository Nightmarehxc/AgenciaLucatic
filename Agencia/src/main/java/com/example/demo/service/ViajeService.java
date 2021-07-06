package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViajeService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String urlMicroProductorVuelos = "http://agencia-micro-vuelos";
	public String urlMicroProductorHoteles = "http://agencia-micro-hoteles";
}
