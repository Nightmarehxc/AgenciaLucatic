package com.example.demo.util;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Document("hoteles")
public class Hoteles {

	@Id
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
	
}
