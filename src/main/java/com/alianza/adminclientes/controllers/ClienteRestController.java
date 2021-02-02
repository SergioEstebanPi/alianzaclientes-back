package com.alianza.adminclientes.controllers;

import java.util.List;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alianza.adminclientes.models.Cliente;
import com.alianza.adminclientes.services.IClienteService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	private IClienteService clienteServiceImpl;
	
	@GetMapping("/clientes")
	public List<Cliente> index(){
		return clienteServiceImpl.findAll();
	}
	
	@GetMapping("/cliente/{shared_key}")
	public Cliente show(@PathVariable String shared_key) {
		return clienteServiceImpl.findbySharedKey(shared_key);
	}
	
	@PostMapping("/cliente")
	//@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente cliente) {
		return clienteServiceImpl.save(cliente);
	}
}
