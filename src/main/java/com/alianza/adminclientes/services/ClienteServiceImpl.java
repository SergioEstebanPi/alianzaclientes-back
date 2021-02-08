package com.alianza.adminclientes.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alianza.adminclientes.dao.IClienteDAO;
import com.alianza.adminclientes.models.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private IClienteDAO iClienteDAO;
	
	@Override
	public List<Cliente> findAll() {
		return  (List<Cliente>) iClienteDAO.findAll();
	}

	@Override
	public List<Cliente> findbySharedKey(String sharedKey) {
		return (List<Cliente>) iClienteDAO.findBySharedKeyContains(sharedKey);
	}

	@Override
	public Cliente save(Cliente cliente) {
		return iClienteDAO.save(cliente);
	}

}
