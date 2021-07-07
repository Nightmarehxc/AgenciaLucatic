package com.example.reservas.dao;

import com.example.reservas.model.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservaDAO extends MongoRepository<Reserva, String>
{
    Iterable<Reserva> findAllByHoltelId(String hotelId);

    Iterable<Reserva> findAllByVueloId(String VueloId);

    Iterable<Reserva> findAllByUserId(String userId);
}
