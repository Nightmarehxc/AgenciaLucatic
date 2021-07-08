package com.example.demo.util;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Vuelos")
public class Vuelos {

	String idVuelo;

	String origin;

	String destination;

	double price;

	Date time;

	public Vuelos() {
		super();
	}

	public Vuelos(String idVuelo, String origin, String destination, double price, Date time) {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Vuelos [idVuelo=" + idVuelo + ", origin=" + origin + ", destination=" + destination + ", price=" + price
				+ ", time=" + time + "]";
	}

}
