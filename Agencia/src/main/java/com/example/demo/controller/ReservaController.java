package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ReservaService;

@Controller
@RequestMapping("reserva")
public class ReservaController {

    @Autowired
	private ReservaService reservaService;

    @RequestMapping(value = "/getAllByUser")
    public String getAllByUser(@RequestParam("id") String id, Model m)
    {
        m.addAttribute("rUser",reservaService.getAllByUser(id));
        return "reservasByUser";
    }

    @RequestMapping(value = "/getAllByHotel")
    public String getAllByHotel(@RequestParam("id") String id, Model m)
    {   
        m.addAttribute("rHotel",reservaService.getAllByHotel(id));
        return "reservasByHotel";
    }

    @RequestMapping(value = "/getAllByVuelo")
    public String getAllByVuelo(@RequestParam("id") String id, Model m)
    {
        m.addAttribute("rVuelo",reservaService.getAllByVuelo(id));
        return "reservasByVuelo";
    }
}