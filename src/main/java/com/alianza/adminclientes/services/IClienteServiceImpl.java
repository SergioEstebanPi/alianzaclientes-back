package com.alianza.adminclientes.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.alianza.adminclientes.models.Cliente;

@Service
public class IClienteServiceImpl implements IClienteService {
	List<Cliente> clientes;
	
	public IClienteServiceImpl() {
		clientes = new ArrayList<Cliente>();
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(1);
		cliente1.setSharedKey("jgutierrez");
		cliente1.setBusinessId("Juliana Gutierrez");
		cliente1.setEmail("jgutierrez@gmail.com");
		cliente1.setPhone("3219876543");
		cliente1.setDateAdded("20/05/2019");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2);
		cliente2.setSharedKey("mmartinez");
		cliente2.setBusinessId("Manuel Martinez");
		cliente2.setEmail("mmartinez@gmail.com");
		cliente2.setPhone("3219876543");
		cliente2.setDateAdded("20/05/2019");
		
		Cliente cliente3 = new Cliente();
		cliente3.setId(3);
		cliente3.setSharedKey("aruiz");
		cliente3.setBusinessId("Ana Ruíz");
		cliente3.setEmail("aruiz@gmail.com");
		cliente3.setPhone("3219876543");
		cliente3.setDateAdded("20/05/2019");
		
		Cliente cliente4 = new Cliente();
		cliente4.setId(4);
		cliente4.setSharedKey("ogarcia");
		cliente4.setBusinessId("Oscar García");
		cliente4.setEmail("ogarcia@gmail.com");
		cliente4.setPhone("3219876543");
		cliente4.setDateAdded("20/05/2019");
		
		Cliente cliente5 = new Cliente();
		cliente5.setId(5);
		cliente5.setSharedKey("tramos");
		cliente5.setBusinessId("Tania Ramos");
		cliente5.setEmail("jgutierrez@gmail.com");
		cliente5.setPhone("3219876543");
		cliente5.setDateAdded("20/05/2019");
		
		Cliente cliente6 = new Cliente();
		cliente6.setId(6);
		cliente6.setSharedKey("cariza");
		cliente6.setBusinessId("Carlos Ariza");
		cliente6.setEmail("cariza@gmail.com");
		cliente6.setPhone("3219876543");
		cliente6.setDateAdded("20/05/2019");
		
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		clientes.add(cliente5);
		clientes.add(cliente6);
	}
	
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
