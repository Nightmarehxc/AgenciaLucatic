package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UsuariosDTO;
import com.example.demo.interfaces.IUsuariosSERVICE;
import com.example.demo.repository.UsuariosREPOSITORY;
import com.example.demo.util.Convertidor;

@Service
public class UsuariosSERVICE implements IUsuariosSERVICE {

	@Autowired
	UsuariosREPOSITORY usuariosREPOSITORY;

	@Override
	public List<UsuariosDTO> findAll() {
		return Convertidor.convertirLista(usuariosREPOSITORY.findAll());
	}

	@Override
	public UsuariosDTO get_usuario_by_dni(String dni) {
		return Convertidor.entity_to_dto(usuariosREPOSITORY.getUsuarioByDni(dni));
	}

	@Override
	public void add(UsuariosDTO usuariosDTO) {
		usuariosREPOSITORY.save(Convertidor.dto_to_entity(usuariosDTO));
	}

	@Override
	public void delete_by_dni(String dni) {
		usuariosREPOSITORY.deleteById(dni);		
	}
}
