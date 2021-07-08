package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.util.Hoteles;
import com.example.demo.util.Reservas;
import com.example.demo.util.ResponseDTO;
import com.example.demo.util.Usuarios;
import com.example.demo.util.Vuelos;

@Service
public class ReservaService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	ViajeService viajeService;

	@Autowired
	UsuarioService usuarioService;

	public String urlMicroProductorReservas = "http://agencia-micro-reservas/reservas";
	public String urlMicroProductorHoteles = "http://agencia-micro-hoteles/api";
	public String urlMicroProductorVuelos = "http://agencia-micro-vuelos/vuelos";

	public List<Reservas> getAllByUser(String id) {
		Reservas[] reservas = restTemplate.getForObject(urlMicroProductorReservas + "/getAllByUser?id=" + id,
				Reservas[].class);
		return Arrays.asList(reservas);
	}

	public List<Reservas> getAllByHotel(String id) {
		Reservas[] reservas = restTemplate.getForObject(urlMicroProductorReservas + "/getAllByHotel?id=" + id,
				Reservas[].class);
		return Arrays.asList(reservas);
	}

	public List<Reservas> getAllByVuelo(String id) {
		Reservas[] reservas = restTemplate.getForObject(urlMicroProductorReservas + "/getAllByVuelo?id=" + id,
				Reservas[].class);
		return Arrays.asList(reservas);
	}

	public String saveReserva(Reservas reserva) {
		return restTemplate.postForObject(urlMicroProductorReservas + "/createReserva", reserva, String.class);
	}

	public List<Reservas> getAll() {
		Reservas[] reservas = restTemplate.getForObject(urlMicroProductorReservas + "/getAll", Reservas[].class);
		return Arrays.asList(reservas);
	}

	public ResponseDTO getById(String id) {
		Reservas res = restTemplate.getForObject(urlMicroProductorReservas + "/getByID?id=" + id, Reservas.class);
		ResponseDTO resDTO = reservaDetail(res);
		return resDTO;
	}

	public ResponseDTO reservaDetail(Reservas reserva) {
		Hoteles h1 = viajeService.getHotelById(reserva.getHoltelId());
		Vuelos v1 = viajeService.getVueloById(reserva.getVueloId());
		Usuarios u1 = usuarioService.find_by_dni(reserva.getUserId());
		ResponseDTO resDTO = new ResponseDTO(h1, reserva, v1, u1);

		return resDTO;
	}
}