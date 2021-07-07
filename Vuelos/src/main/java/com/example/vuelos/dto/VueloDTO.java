package com.example.vuelos.dto;


import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

public class VueloDTO implements Serializable
{

    @Id
    String idVuelo;

    String origin;

    String destination;

    String price;

    Date time;
}
