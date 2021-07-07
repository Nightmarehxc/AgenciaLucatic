package com.example.vuelos.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document
public class Vuelo implements Serializable
{
    @Id
    String idVuelo;

    String origin;

    String destination;

    double price;

    Date time;

    public Vuelo()
    {
    }

    public Vuelo(String idVuelo, String origin, String destination, double price, Date time)
    {
        this.idVuelo = idVuelo;
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.time = time;
    }

    public String getIdVuelo()
    {
        return idVuelo;
    }

    public void setIdVuelo(String idVuelo)
    {
        this.idVuelo = idVuelo;
    }

    public String getOrigin()
    {
        return origin;
    }

    public void setOrigin(String origin)
    {
        this.origin = origin;
    }

    public String getDestination()
    {
        return destination;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public Date getTime()
    {
        return time;
    }

    public void setTime(Date time)
    {
        this.time = time;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;

        if (!(o instanceof Vuelo)) return false;

        Vuelo vuelo = (Vuelo) o;

        return new EqualsBuilder().append(getIdVuelo(), vuelo.getIdVuelo()).append(getOrigin(), vuelo.getOrigin()).append(getDestination(), vuelo.getDestination()).append(getPrice(), vuelo.getPrice()).append(getTime(), vuelo.getTime()).isEquals();
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder(17, 37).append(getIdVuelo()).append(getOrigin()).append(getDestination()).append(getPrice()).append(getTime()).toHashCode();
    }

    @Override
    public String toString()
    {
        return "Vuelo{" +
                "idVuelo='" + idVuelo + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", price='" + price + '\'' +
                ", time=" + time +
                '}';
    }
}
