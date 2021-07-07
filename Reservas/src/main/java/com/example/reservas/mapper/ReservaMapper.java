package com.example.reservas.mapper;

import com.example.reservas.dto.ReservaDTO;
import com.example.reservas.model.Reserva;
import org.springframework.stereotype.Component;

@Component
public class ReservaMapper
{
    public Reserva reservaToDTO(ReservaDTO reservaDTO)
    {
        Reserva reserva = new Reserva();
        reserva.setIdReserva(reservaDTO.getIdReserva());
        reserva.setHoltelId(reservaDTO.getHoltelId());
        reserva.setUserId(reservaDTO.getUserId());
        reserva.setVueloId(reservaDTO.getVueloId());

        return reserva;
    }
}
