package com.example.demo.util;

import java.sql.Date;

public class Vuelos {
    
	String idVuelo;

    String origin;

    String destination;

    String price;

    Date time;

	public Vuelos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vuelos(String idVuelo, String origin, String destination, String price, Date time) {
		super();
		this.idVuelo = idVuelo;
		this.origin = origin;
		this.destination = destination;
		this.price = price;
		this.time = time;
	}

	public String getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(String idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
    
    
}
