package com.example.reservas.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReservaDTO
{
    private String idReserva;
    private String holtelId;
    private String userId;
    private String vueloId;
    double totalPrice;
    int n;
    LocalDateTime localDateTime;


    public ReservaDTO(String idReserva, String holtelId, String userId, String vueloId, double totalPrice, int n, LocalDateTime localDateTime)
    {
        this.idReserva = idReserva;
        this.holtelId = holtelId;
        this.userId = userId;
        this.vueloId = vueloId;
        this.totalPrice = totalPrice;
        this.n = n;
        this.localDateTime = localDateTime;
    }
}
