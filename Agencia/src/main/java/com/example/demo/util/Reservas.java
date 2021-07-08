package com.example.demo.util;

import java.time.LocalDateTime;

public class Reservas {

	private String idReserva;
	private String holtelId;
	private String userId;
	private String vueloId;

	private double totalPrice;
	private int n;
	private LocalDateTime localDateTime;

	public Reservas() {
		super();
	}

	public Reservas(String userId) {
		super();
		this.userId = userId;
	}

	public Reservas(String idReserva, String holtelId, String userId, String vueloId, double totalPrice, int n,
			LocalDateTime localDateTime) {
		super();
		this.idReserva = idReserva;
		this.holtelId = holtelId;
		this.userId = userId;
		this.vueloId = vueloId;
		this.totalPrice = totalPrice;
		this.n = n;
		this.localDateTime = localDateTime;
	}

	public String getIdReserva() {
		return this.idReserva;
	}

	public void setIdReserva(String idReserva) {
		this.idReserva = idReserva;
	}

	public String getHoltelId() {
		return this.holtelId;
	}

	public void setHoltelId(String holtelId) {
		this.holtelId = holtelId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVueloId() {
		return this.vueloId;
	}

	public void setVueloId(String vueloId) {
		this.vueloId = vueloId;
	}

	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getN() {
		return this.n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public LocalDateTime getLocalDateTime() {
		return this.localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

}