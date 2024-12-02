package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Cliente;

public interface Cliente_repositorio extends JpaRepository<Cliente, Long> {

}
