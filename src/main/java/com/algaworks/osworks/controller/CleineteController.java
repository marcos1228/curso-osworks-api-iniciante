package com.algaworks.osworks.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class CleineteController {

	@GetMapping("/cleintes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Marcos Barbosa Evangelista");
		cliente1.setEmail("marcos_pp.16@hotmail.com");
		cliente1.setTelefone("91993964439");//

		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Isabel Barbosa Evangelista");
		cliente2.setEmail("isabel_barbosa19hotmail.com");
		cliente2.setTelefone("73783698987");

		return Arrays.asList(cliente1, cliente2);
	}
}
