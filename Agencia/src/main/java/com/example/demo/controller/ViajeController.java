package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ViajeService;

@Controller
@RequestMapping("viajes")
public class ViajeController {

	@Autowired
	private ViajeService viajeService;
	
	@RequestMapping()
	public String getMenu() {
		return "menu";
	}
}
