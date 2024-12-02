package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Servico;
import com.example.demo.repository.ServicoRepositorio;

@Service
public class ServicoService {
	private final ServicoRepositorio servicoRepositorio;

	@Autowired
	public ServicoService(ServicoRepositorio servicoRepositorio) {
		this.servicoRepositorio = servicoRepositorio;
	}

	public Servico salvarCliente(Servico Entidade) {
		return servicoRepositorio.save(Entidade);
	}

	public Servico consultarClienteporId(Long id) {
		return servicoRepositorio.findById(id).orElse(null);
	}

	public List<Servico> consultarTodosClientes() {
		return servicoRepositorio.findAll();
	}

}
