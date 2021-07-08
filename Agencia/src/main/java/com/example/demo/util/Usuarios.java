package com.example.demo.util;

public class Usuarios {

	private String dni;
	private String nombre;

	public Usuarios() {
		super();
	}

	public Usuarios(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
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
