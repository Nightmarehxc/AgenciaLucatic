package com.example.demo.controller;

import com.example.demo.service.ReservaService;
import com.example.demo.util.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/reservas")
public class ReservaController
{

    @Autowired
    private ReservaService reservaService;

    @RequestMapping(value = "/getAllByUser", method = RequestMethod.GET)
    public String getAllByUser(@RequestParam("id") String id, Model m)
    {
        m.addAttribute("rUser", reservaService.getAllByUser(id));
        return "reservasByUser";
    }

    @RequestMapping(value = "/getAllByHotel", method = RequestMethod.GET)
    public String getAllByHotel(@RequestParam("id") String id, Model m)
    {
        m.addAttribute("rHotel", reservaService.getAllByHotel(id));
        return "reservasByHotel";
    }

    @RequestMapping(value = "/getAllByVuelo", method = RequestMethod.GET)
    public String getAllByVuelo(@RequestParam("id") String id, Model m)
    {
        m.addAttribute("rVuelo", reservaService.getAllByVuelo(id));
        return "reservasByVuelo";
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public String getAll(Model m)
    {
        m.addAttribute("rVuelo", reservaService.getAll());
        return "bookings";
    }
//
//    @RequestMapping(value = ("/saveReserva"), method = RequestMethod.POST)
//    public String saveUser(Model m, Reservas reserva)
//    {
//        reservaService.saveUser(reserva);
//        System.out.println("creado con exto" + reserva);
//        return "menu";
//    }


    @RequestMapping(value = ("/saveReserva"), method = RequestMethod.POST)
    public String saveUser(Model m, ResponseDTO response)
    {
        reservaService.saveUser(response);
//        System.out.println("creado con exto" + reserva);
        return "menu";
    }




}