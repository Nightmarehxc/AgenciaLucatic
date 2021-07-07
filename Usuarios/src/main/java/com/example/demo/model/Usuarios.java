package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.dto.UsuariosDTO;

@Entity
@Table(name = "usuarios")
public class Usuarios {

	@Id
	@Column
	private String dni;
	@Column
	private String nombre;

	public Usuarios() {
		super();
	}

	public Usuarios(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	public Usuarios(UsuariosDTO usuariosDTO) {
		this.dni = usuariosDTO.getDni();
		this.nombre = usuariosDTO.getNombre();
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
		return "Usuarios [dni=" + dni + ", nombre=" + nombre + "]";
	}
}
