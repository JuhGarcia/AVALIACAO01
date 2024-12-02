package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Cliente;
import com.example.demo.repository.Cliente_repositorio;

@Service
public class Cliente_servico {

	private final Cliente_repositorio cliente_repositorio;

	@Autowired
	public Cliente_servico(Cliente_repositorio cliente_repositorio) {
		this.cliente_repositorio = cliente_repositorio;
	}

	public Cliente salvarCliente(Cliente Cliente) {
		return cliente_repositorio.save(Cliente);
	}

	public Cliente consultarClienteporId(Long id) {
		return cliente_repositorio.findById(id).orElse(null);
	}

	public List<Cliente> consultarTodosClientes() {
		return cliente_repositorio.findAll();
	}

}
