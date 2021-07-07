package com.example.reservas.model;

import lombok.Data;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Document
@Data
public class Reserva implements Serializable
{
    @Id
    String idReserva;

    private String holtelId;
    private String userId;
    private String vueloId;
    double totalPrice;
    int n;
    private LocalDateTime localDateTime;

    public Reserva()
    {
    }

    public Reserva(String idReserva, String holtelId, String userId, String vueloId, double totalPrice, int n, LocalDateTime localDateTime)
    {
        this.idReserva = idReserva;
        this.holtelId = holtelId;
        this.userId = userId;
        this.vueloId = vueloId;
        this.totalPrice = totalPrice;
        this.n = n;
        this.localDateTime = localDateTime;
    }
//    public String getIdReserva()
//    {
//        return idReserva;
//    }
//
//    public void setIdReserva(String idReserva)
//    {
//        this.idReserva = idReserva;
//    }
//
//    public String getHoltelId()
//    {
//        return holtelId;
//    }
//
//    public void setHoltelId(String holtelId)
//    {
//        this.holtelId = holtelId;
//    }
//
//    public String getUserId()
//    {
//        return userId;
//    }
//
//    public void setUserId(String userId)
//    {
//        this.userId = userId;
//    }
//
//    public String getVueloId()
//    {
//        return vueloId;
//    }
//
//    public void setVueloId(String vueloId)
//    {
//        this.vueloId = vueloId;
//    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;

        if (!(o instanceof Reserva)) return false;

        Reserva reserva = (Reserva) o;

        return new EqualsBuilder().append(getIdReserva(), reserva.getIdReserva()).append(getHoltelId(), reserva.getHoltelId()).append(getUserId(), reserva.getUserId()).append(getVueloId(), reserva.getVueloId()).isEquals();
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder(17, 37).append(getIdReserva()).append(getHoltelId()).append(getUserId()).append(getVueloId()).toHashCode();
    }

    @Override
    public String toString()
    {
        return "Reserva{" +
                "idReserva='" + idReserva + '\'' +
                ", holteId='" + holtelId + '\'' +
                ", userId='" + userId + '\'' +
                ", vueloId='" + vueloId + '\'' +
                '}';
    }
}
