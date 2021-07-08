package com.example.demo.service;

import com.example.demo.util.Reservas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ReservaService
{

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    ViajeService viajeService;

    public String urlMicroProductorReservas = "http://agencia-micro-reservas/reservas";
    public String urlMicroProductorHoteles = "http://agencia-micro-hoteles/api";
    public String urlMicroProductorVuelos = "http://agencia-micro-vuelos/vuelos";

    public List<Reservas> getAllByUser(String id)
    {
        Reservas[] reservas = restTemplate.getForObject(urlMicroProductorReservas + "/getAllByUser?id=" + id,
                Reservas[].class);
        return Arrays.asList(reservas);
    }

    public List<Reservas> getAllByHotel(String id)
    {
        Reservas[] reservas = restTemplate.getForObject(urlMicroProductorReservas + "/getAllByHotel?id=" + id,
                Reservas[].class);
        return Arrays.asList(reservas);
    }

    public List<Reservas> getAllByVuelo(String id)
    {
        Reservas[] reservas = restTemplate.getForObject(urlMicroProductorReservas + "/getAllByVuelo?id=" + id,
                Reservas[].class);
        return Arrays.asList(reservas);
    }

//	public Reservas getReservaById(int id) {
//		return restTemplate.getForObject(urlMicroProductorHoteles + "/getHoteles{id}", Hoteles.class);
//	}

    public String saveReserva(Reservas reserva)
    {
        return restTemplate.postForObject(urlMicroProductorReservas + "/createReserva", reserva, String.class);
    }

//	public void saveReserva(ResponseDTO reserva) {
//		Reservas r = reserva.getReservas();
//		String vueloID = reserva.getVuelos().getIdVuelo();
//		String hotelID = reserva.getVuelos().getIdVuelo();
//
//		Hoteles h1 = viajeService.getHotelById(reserva.getHoteles().getId());
//
//		Vuelos v = viajeService.getVueloById(reserva.getVuelos().getIdVuelo());
//
//		restTemplate.postForObject(urlMicroProductorReservas + "/createReserva", r, Reservas.class);
//	}

    public List<Reservas> getAll()
    {
        Reservas[] reservas = restTemplate.getForObject(urlMicroProductorReservas + "/getAll", Reservas[].class);
        return Arrays.asList(reservas);
    }

    public Reservas getById(String id)
    {
        return restTemplate.getForObject(urlMicroProductorReservas + "/getAll", Reservas.class);
    }
}