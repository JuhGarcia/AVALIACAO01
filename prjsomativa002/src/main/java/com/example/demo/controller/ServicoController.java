package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Servico;
import com.example.demo.services.ServicoService;

@RestController
@RequestMapping("/Servico")
public class ServicoController {
	private final ServicoService servico;

	@Autowired
	public ServicoController(ServicoService servico) {
		this.servico = servico;
	}

	@PostMapping("/criar")
	public Servico criarPet(@RequestBody Servico entidade) {
		return servico.salvarCliente(entidade);
	}

	@GetMapping
	public List<Servico> consultaTodos() {
		return servico.consultarTodosClientes();
	}

	@GetMapping("/{id}")
	public Servico consultarPorId(@PathVariable Long id) {
		return servico.consultarClienteporId(id);
	}

}
