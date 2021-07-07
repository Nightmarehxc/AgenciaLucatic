package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.util.Hoteles;
import com.example.demo.util.Vuelos;

@Service
public class ViajeService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String urlMicroProductorVuelos = "http://agencia-micro-vuelos";
	public String urlMicroProductorHoteles = "http://agencia-micro-hoteles";
	
	public Hoteles[] getHoteles() {
		Hoteles[] hoteles = restTemplate.getForObject(urlMicroProductorHoteles+"/api/hoteles", Hoteles[].class);
		return hoteles;
	}
	
	public Vuelos[] getVuelos() {
		Vuelos[] vuelos = restTemplate.getForObject(urlMicroProductorVuelos+"/vuelos/getAll", Vuelos[].class);
		return vuelos;
	}
}
