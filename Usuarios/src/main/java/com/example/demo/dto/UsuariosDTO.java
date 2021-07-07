package com.example.demo.dto;

import java.io.Serializable;

import com.example.demo.model.Usuarios;

public class UsuariosDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private String dni;
	private String nombre;
	
	public UsuariosDTO() {
		super();
	}
	
	public UsuariosDTO(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public UsuariosDTO(Usuarios usuarios) {
		this.dni = usuarios.getDni();
		this.nombre = usuarios.getNombre();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "UsuariosDTO [dni=" + dni + ", nombre=" + nombre + "]";
	}
}
