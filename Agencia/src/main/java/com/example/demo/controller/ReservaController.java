package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.ReservaService;
import com.example.demo.service.UsuarioService;
import com.example.demo.service.ViajeService;
import com.example.demo.util.Hoteles;
import com.example.demo.util.Reservas;
import com.example.demo.util.Usuarios;
import com.example.demo.util.Vuelos;

@Controller
@RequestMapping("/reservas")
public class ReservaController {

	@Autowired
	private ReservaService reservaService;

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private ViajeService viajeService;

	@RequestMapping(value = "/getAllByUser", method = RequestMethod.GET)
	public String getAllByUser(@RequestParam("id") String id, Model m) {
		m.addAttribute("rUser", reservaService.getAllByUser(id));
		return "reservasByUser";
	}

	@RequestMapping(value = "/getAllByHotel", method = RequestMethod.GET)
	public String getAllByHotel(@RequestParam("id") String id, Model m) {
		m.addAttribute("rHotel", reservaService.getAllByHotel(id));
		return "reservasByHotel";
	}

	@RequestMapping(value = "/getAllByVuelo", method = RequestMethod.GET)
	public String getAllByVuelo(@RequestParam("id") String id, Model m) {
		m.addAttribute("rVuelo", reservaService.getAllByVuelo(id));
		return "reservasByVuelo";
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public String getAll(Model m) {
		m.addAttribute("reservas", reservaService.getAll());
		return "bookings";
	}

	@RequestMapping("/crear/{idUsuario}")
	public String createReserva(@PathVariable("idUsuario") String idUsuario, Model m) {
		Usuarios usuario = usuarioService.find_by_dni(idUsuario);
		List<Hoteles> hotelesList = viajeService.getHoteles();
		List<Vuelos> vuelosList = viajeService.getVuelos();
		m.addAttribute("usuario", usuario);
		m.addAttribute("hoteles", hotelesList);
		m.addAttribute("vuelos", vuelosList);
		m.addAttribute("reserva", new Reservas(usuario.getDni()));
		return "add_booking";
	}

	@RequestMapping(value = ("/saveReserva"), method = RequestMethod.POST)
	public String saveUser(Model m, Reservas reserva) {
		reserva.setTotalPrice(500);
		String res = reservaService.saveReserva(reserva);
		if (res.equals("OK")) {
			m.addAttribute("mensaje", "Reserva creada correctamente");
		} else {
			m.addAttribute("mensaje", "Error al crear la reserva");
		}
		m.addAttribute("reserva", reserva);
		// TODO: redireccionar al detalle de la reserva después de crear
		return "add_booking";
	}

}