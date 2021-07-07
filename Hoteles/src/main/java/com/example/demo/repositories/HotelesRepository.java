package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.util.Hoteles;

public interface HotelesRepository extends MongoRepository<Hoteles, String> {

}
