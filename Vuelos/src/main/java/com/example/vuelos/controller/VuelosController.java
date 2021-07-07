package com.example.vuelos.controller;

import com.example.vuelos.model.Vuelo;
import com.example.vuelos.service.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/vuelos")
public class VuelosController
{
    @Autowired
    VueloService vueloService;

    @RequestMapping(value = "/createVuelo", method = RequestMethod.POST)
    String save(@RequestBody Vuelo vuelo)
    {
        return vueloService.saveVuelo(vuelo);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    Set<Vuelo> getAll()
    {
        return vueloService.getAllVuelos();
    }

    @RequestMapping(value = "/getAllByDestination/{destination}", method = RequestMethod.GET)
    Set<Vuelo> getAllByDestination(@PathVariable("destination") String destination)
    {
        return vueloService.getAllVuelosByDestination(destination);
    }

    @RequestMapping(value = "/getVuelo/{id}", method = RequestMethod.GET)
    Vuelo getVuelo(@PathVariable("id") String id)
    {
        return vueloService.getVueloByID(id);
    }


}
