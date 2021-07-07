package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.util.Hoteles;
import com.example.demo.util.Vuelos;

@Service
public class ViajeService {

	@Autowired
	private RestTemplate restTemplate;

	public String urlMicroProductorVuelos = "http://agencia-micro-vuelos/vuelos";
	public String urlMicroProductorHoteles = "http://agencia-micro-hoteles/api";

	public List<Hoteles> getHoteles() {
		Hoteles[] hoteles = restTemplate.getForObject(urlMicroProductorHoteles + "/hoteles", Hoteles[].class);
		return Arrays.asList(hoteles);
	}
	
	public Hoteles createHotel(Hoteles hotel) {
		return restTemplate.postForObject(urlMicroProductorHoteles + "/hoteles", hotel, Hoteles.class);
	}

	// VUELOS
	public List<Vuelos> getVuelos() {
		Vuelos[] vuelos = restTemplate.getForObject(urlMicroProductorVuelos + "/getAll", Vuelos[].class);
		return Arrays.asList(vuelos);
	}

	public String createVuelo(Vuelos vuelo) {
		return restTemplate.postForObject(urlMicroProductorVuelos + "/createVuelo", vuelo, String.class);
	}
}
