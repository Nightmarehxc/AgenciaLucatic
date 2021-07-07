package com.example.vuelos.service.impl;

import com.example.vuelos.dao.VuelosDAO;
import com.example.vuelos.model.Vuelo;
import com.example.vuelos.service.VueloService;
import com.mongodb.MongoCursorNotFoundException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Service
public class VueloServiceImpl implements VueloService
{
    @Autowired
    VuelosDAO vuelosDAO;

    @Override
    public Set<Vuelo> getAllVuelos()
    {
        Set<Vuelo> response = new HashSet<>();
        vuelosDAO.findAll().forEach(response::add);
        String a;


        return response;
    }

    @Override
    public Set<Vuelo> getAllVuelosByDestination(String destination)
    {
        Set<Vuelo> response = new HashSet<>();
        vuelosDAO.findAllByDestination(destination).forEach(response::add);
        return response;
    }

    @Override
    public String saveVuelo(Vuelo vuelo)
    {
        vuelosDAO.deleteAll();
        String response;
        try
        {
            String destination = refactorString(vuelo.getDestination());
            String origin = refactorString(vuelo.getOrigin());
            vuelo.setOrigin(origin);
            vuelo.setOrigin(destination);
            String id = LocalDateTime.now().getDayOfYear() + "o" + origin + "d" + destination;
            id = id.replaceAll("\\s+", "");
            vuelo.setIdVuelo(id);


            vuelosDAO.save(vuelo);
            response = "OK";

        }
        catch (Exception e)
        {
            response = e.getMessage();
        }
        return response;
    }

    private String refactorString(String input)
    {
        String cadena = input;
        cadena = cadena.toUpperCase();
        cadena = StringUtils.stripAccents(cadena);
        return cadena;
    }

    @Override
    public Vuelo getVueloByID(String id)
    {
        Vuelo vuelo;
        try
        {
            vuelo = vuelosDAO.findById(id).orElse(null);
        }
        catch (MongoCursorNotFoundException mongoCursorNotFoundException)
        {
            vuelo = null;
        }
        return vuelo;
    }
}
