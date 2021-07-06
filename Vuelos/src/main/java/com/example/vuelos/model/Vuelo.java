package com.example.vuelos.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;
import java.util.Date;

@Document
public class Vuelo
{
    @Id
    String idVuelo;

    String origin;

    String destination;

    String price;

    Date time;

}
