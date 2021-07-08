package com.example.reservas.service.impl;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservas.dao.ReservaDAO;
import com.example.reservas.dto.ReservaDTO;
import com.example.reservas.mapper.ReservaMapper;
import com.example.reservas.model.Reserva;
import com.example.reservas.service.ReservaService;
import com.mongodb.DuplicateKeyException;
import com.mongodb.MongoCursorNotFoundException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ReservaServiceImpl implements ReservaService
{
    @Autowired
    ReservaDAO reservaDAO;

    @Autowired
    ReservaMapper reservaMapper;

    @Override
    public String saveReserva(ReservaDTO reservaDTO)
    {
        reservaDAO.deleteAll();
        String response = null;
        try
        {
            Reserva newReserva = reservaMapper.reservaToDTO(reservaDTO);
            newReserva.setLocalDateTime(LocalDateTime.now());
            newReserva.setIdReserva(LocalDateTime.now().getHour() + "V" + reservaDTO.getUserId());
            newReserva.setTotalPrice(reservaDTO.getTotalPrice() * reservaDTO.getN());
            newReserva.setN(reservaDTO.getN());
            reservaDAO.save(newReserva);
            response = "OK";
        }
        catch (DuplicateKeyException de)
        {
            response = de.getMessage();
        }
        catch (Exception e)
        {
            response = e.getMessage();
        }
        return response;
    }

    @Override
    public Set<Reserva> getAllByUser(String id)
    {
        Set<Reserva> response = new HashSet<>();
        try
        {
            reservaDAO.findAllByUserId(id).forEach(response::add);

        }
        catch (MongoCursorNotFoundException e)
        {
            log.info("No hay ninguna reserva asociada a la id " + id);
        }
        return response;
    }

    @Override
    public Set<Reserva> getAllByHotel(String id)
    {
        Set<Reserva> response = new HashSet<>();
        try
        {
            reservaDAO.findAllByHoltelId(id).forEach(response::add);

        }
        catch (MongoCursorNotFoundException e)
        {
            log.info("No hay ninguna reserva asociada a la id " + id);
        }
        return response;
    }

    @Override
    public Set<Reserva> getAllByVuelo(String id)
    {
        Set<Reserva> response = new HashSet<>();
        try
        {
            reservaDAO.findAllByVueloId(id).forEach(response::add);

        }
        catch (MongoCursorNotFoundException e)
        {
            log.info("No hay ninguna reserva asociada a la id " + id);
        }
        return response;
    }

    @Override
    public Set<Reserva> getAllReservas()
    {
        Set<Reserva> reservas = new HashSet<>();
        reservaDAO.findAll().forEach(reservas::add);
        return reservas;
    }
}
