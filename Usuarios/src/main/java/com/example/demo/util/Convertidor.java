package com.example.demo.util;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.dto.UsuariosDTO;
import com.example.demo.model.Usuarios;

public class Convertidor {

	public static List<UsuariosDTO> convertirLista(List<Usuarios> usuarios){
		return usuarios.stream().map(UsuariosDTO::new).collect(Collectors.toList());
	}
	
	public static Usuarios dto_to_entity(UsuariosDTO usuariosDTO) {
		return new Usuarios(usuariosDTO);
	}
	
	public static UsuariosDTO entity_to_dto(Usuarios usuarios) {
		return new UsuariosDTO(usuarios);
	}
}
