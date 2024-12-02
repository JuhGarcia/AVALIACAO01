package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Cliente;
import com.example.demo.services.Cliente_servico;

@RestController
@RequestMapping("/Cliente")
public class Cliente_controller {
	private final Cliente_servico cliente_servico;

	@Autowired
	public Cliente_controller(Cliente_servico cliente_servico) {
		this.cliente_servico = cliente_servico;
	}

	@PostMapping("/criar")
	public Cliente criarCliente(@RequestBody Cliente cliente) {
		return cliente_servico.salvarCliente(cliente);
	}

	@GetMapping
	public List<Cliente> consultaTodos() {
		return cliente_servico.consultarTodosClientes();
	}

	@GetMapping("/{id}")
	public Cliente consultarPorId(@PathVariable Long id) {
		return cliente_servico.consultarClienteporId(id);
	}
}
