package com.example.vuelos.service;

import com.example.vuelos.model.Vuelo;

import java.util.Set;

public interface VueloService
{
    Set<Vuelo> getAllVuelos();

    Set<Vuelo> getAllVuelosByDestination(String destination);

    String saveVuelo(Vuelo vuelo);
}
