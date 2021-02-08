package com.alianza.adminclientes.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alianza.adminclientes.models.Cliente;
import com.alianza.adminclientes.services.IClienteService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class ClienteRestController {
	
	@Autowired
	private IClienteService clienteServiceImpl;
	
	@GetMapping("/clientes")
	public List<Cliente> index(){
		return clienteServiceImpl.findAll();
	}
	
	@GetMapping("/clientes/{shared_key}")
	public List<Cliente> show(@PathVariable String shared_key) {
		return clienteServiceImpl.findbySharedKey(shared_key);
	}
	
	@PostMapping("/clientes")
	//@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente cliente) {
		return clienteServiceImpl.save(cliente);
	}
	
	@PutMapping("/clientes")
	public Cliente updated(@RequestBody Cliente cliente) {
		return clienteServiceImpl.save(cliente);
	}
}
