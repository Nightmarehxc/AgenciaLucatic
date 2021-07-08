package com.example.demo.util;

import lombok.Data;

@Data
public class ResponseDTO
{
    Hoteles hoteles;
    Reservas reservas;
    Vuelos vuelos;
    Usuarios usuarios;

    public ResponseDTO()
    {

    }


    public ResponseDTO(Hoteles hoteles, Reservas reservas, Vuelos vuelos, Usuarios usuarios)
    {
        this.hoteles = hoteles;
        this.reservas = reservas;
        this.vuelos = vuelos;
        this.usuarios = usuarios;
    }
}
