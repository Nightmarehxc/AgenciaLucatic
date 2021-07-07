package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Usuarios;

public interface UsuariosREPOSITORY extends JpaRepository<Usuarios, String> {
	public Usuarios getUsuarioByDni(String dni);
}
