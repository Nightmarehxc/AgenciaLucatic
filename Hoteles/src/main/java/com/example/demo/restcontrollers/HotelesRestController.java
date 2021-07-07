package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositories.HotelesRepository;
import com.example.demo.util.Hoteles;

@RestController
@RequestMapping("/api")
public class HotelesRestController {

	@Autowired
	HotelesRepository hotelesRepository;
	
	@GetMapping("/hoteles")
	public List<Hoteles> findAllHoteles(){
		return hotelesRepository.findAll();
	}
	
	@PostMapping("/hoteles")
	public Hoteles createHotel(@RequestBody Hoteles hoteles){
		return hotelesRepository.save(hoteles);
	}
	
	@PutMapping("/hoteles")
	public Hoteles updateHotel(@RequestBody Hoteles hoteles){
		return hotelesRepository.save(hoteles);
	}
	
	@DeleteMapping("/hoteles")
	public void deleteAllHoteles(){
		hotelesRepository.deleteAll();
	}
	
	@DeleteMapping("/hoteles/{id}")
	public void deleteByIdHotel(@PathVariable String id){
		hotelesRepository.deleteById(id);
	}
	
}
