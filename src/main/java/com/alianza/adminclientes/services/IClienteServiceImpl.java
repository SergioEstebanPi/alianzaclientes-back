package com.alianza.adminclientes.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.alianza.adminclientes.models.Cliente;

@Service
public class IClienteServiceImpl implements IClienteService {
	List<Cliente> clientes = new ArrayList<Cliente>();
	
	@Override
	public List<Cliente> findAll() {
		return clientes;
	}

	@Override
	public Cliente findbySharedKey(String shared_key) {
		Cliente encontrado = null;
		for(int i=0;i<clientes.size();i++) {
			if(shared_key.equals(clientes.get(i).getSharedKey())) {
				encontrado = clientes.get(i);
				break;
			}
		}
		return encontrado;
	}

	@Override
	public Cliente save(Cliente cliente) {
		if(clientes.add(cliente)) {
			return cliente; 
		} else {
			return null;
		}
	}

}
