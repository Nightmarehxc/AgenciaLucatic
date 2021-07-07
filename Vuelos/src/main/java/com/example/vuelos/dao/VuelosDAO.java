package com.example.vuelos.dao;

import com.example.vuelos.model.Vuelo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

public interface VuelosDAO extends MongoRepository<Vuelo,String>
{
    Iterable<Vuelo> findAllByDestination(String destination);
    Iterable<Vuelo> findAllByTime(Date time);

}
