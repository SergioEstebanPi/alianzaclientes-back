package com.alianza.adminclientes.services;

import java.util.List;

import com.alianza.adminclientes.models.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
	public List<Cliente> findbySharedKey(String shared_key);
	public Cliente save(Cliente cliente);
}
