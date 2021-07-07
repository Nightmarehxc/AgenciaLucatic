package com.example.reservas.controller;

import com.example.reservas.dto.ReservaDTO;
import com.example.reservas.model.Reserva;
import com.example.reservas.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/reservas")
public class ReservasController
{
    @Autowired
    ReservaService reservaService;


    @RequestMapping(value = "/createReserva", method = RequestMethod.POST)
    String createReserva(@RequestBody ReservaDTO reservaDTO)
    {


        return reservaService.saveReserva(reservaDTO);
    }

    @RequestMapping(value = "/getAllByUser", method = RequestMethod.GET)
    Set<Reserva> getAllByUser(@RequestParam String id)
    {
        return reservaService.getAllByUser(id);
    }

    @RequestMapping(value = "/getAllByHotel", method = RequestMethod.GET)
    Set<Reserva> getAllByHotel(@RequestParam String id)
    {
        return reservaService.getAllByHotel(id);
    }

    @RequestMapping(value = "/getAllByVuelo", method = RequestMethod.GET)
    Set<Reserva> getAllByVuelo(@RequestParam String id)
    {
        return reservaService.getAllByVuelo(id);
    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    Set<Reserva> getAllReservas()
    {
        return reservaService.getAllReservas();
    }
}
