package com.alianza.adminclientes.dao;

import org.springframework.data.repository.CrudRepository;
import com.alianza.adminclientes.models.Cliente;

public interface IClienteDAO extends CrudRepository<Cliente, String> {
	
	Iterable<Cliente> findBySharedKeyContains(String sharedKey);	
}
