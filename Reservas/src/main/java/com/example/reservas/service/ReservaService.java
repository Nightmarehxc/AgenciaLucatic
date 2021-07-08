package com.example.reservas.service;

import com.example.reservas.dto.ReservaDTO;
import com.example.reservas.model.Reserva;

import java.util.Set;

public interface ReservaService
{
    String saveReserva(ReservaDTO reservaDTO);

    Set<Reserva> getAllByUser(String id);

    Set<Reserva> getAllByHotel(String id);

    Set<Reserva> getAllByVuelo(String id);

    Set<Reserva> getAllReservas();

    Reserva getReservaById(String id);
}
