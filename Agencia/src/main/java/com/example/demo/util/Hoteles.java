package com.example.demo.util;

public class Hoteles {

	private String id;
	private String hoteles;
	private String ciudad;
	private int precio;
	

	public Hoteles() {
		super();
	}
	
	public Hoteles(String hoteles, String ciudad, int precio) {
		super();
		this.hoteles = hoteles;
		this.ciudad = ciudad;
		this.precio = precio;
	}
	
	public Hoteles(String id, String hoteles, String ciudad, int precio) {
		super();
		this.id = id;
		this.hoteles = hoteles;
		this.ciudad = ciudad;
		this.precio = precio;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHoteles() {
		return hoteles;
	}

	public void setHoteles(String hoteles) {
		this.hoteles = hoteles;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
