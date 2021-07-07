package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.dto.UsuariosDTO;

public interface IUsuariosSERVICE {
	
	public List<UsuariosDTO> findAll();
	public UsuariosDTO get_usuario_by_dni(String dni);
	public void add(UsuariosDTO usuariosDTO);
	public void delete_by_dni(String dni);
}
