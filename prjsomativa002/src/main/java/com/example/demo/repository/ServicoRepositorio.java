package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Servico;

public interface ServicoRepositorio extends JpaRepository<Servico, Long> {

}
