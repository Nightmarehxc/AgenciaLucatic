package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.util.Reservas;

@Service
public class ReservaService {

	@Autowired
	private RestTemplate restTemplate;

	public String urlMicroProductorReservas = "http://agencia-micro-reservas/reservas";
    
    public List<Reservas> getAllByUser(String id){
        Reservas[] reservas = restTemplate.getForObject(urlMicroProductorReservas+"/getAllByUser?id="id, Reservas[].class);
        return Arrays.asList(reservas);
    }

    public List<Reservas> getAllByHotel(String id){
        Reservas[] reservas = restTemplate.getForObject(urlMicroProductorReservas+"/getAllByHotel?id="id, Reservas[].class);
        return Arrays.asList(reservas);
    }

    public List<Reservas> getAllByVuelo(String id){
        Reservas[] reservas = restTemplate.getForObject(urlMicroProductorReservas+"/getAllByVuelo?id="id, Reservas[].class);
        return Arrays.asList(reservas);
    }
}