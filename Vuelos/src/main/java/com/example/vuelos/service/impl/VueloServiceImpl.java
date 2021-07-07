package com.example.vuelos.service.impl;

import com.example.vuelos.dao.VuelosDAO;
import com.example.vuelos.model.Vuelo;
import com.example.vuelos.service.VueloService;
import com.mongodb.DuplicateKeyException;
import com.mongodb.MongoCursorNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        String response;
        try
        {

            vuelo.setIdVuelo(vuelo.getTime().getTime() + vuelo.getDestination());
            vuelosDAO.save(vuelo);
            response = "OK";

        }
        catch (Exception e)
        {
            response = e.getMessage();
        }
        return response;
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
