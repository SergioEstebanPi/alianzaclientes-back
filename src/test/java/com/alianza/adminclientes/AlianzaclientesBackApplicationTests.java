package com.alianza.adminclientes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alianza.adminclientes.controllers.ClienteRestController;
import com.alianza.adminclientes.models.Cliente;

@SpringBootTest
class AlianzaclientesBackApplicationTests {
	
	@Autowired
	ClienteRestController clienteRestController;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void getClientBySharedKey() {
		assertEquals(3, clienteRestController.show("aruiz").get(0).getId());
	}
	
	@Test
	public void getClientNoExistBySharedKey() {
		assertNull(clienteRestController.show("zzzz"));
	}
	
	@Test
	public void createClient() {
		Cliente cliente = new Cliente();
		cliente.setId(10);
		cliente.setSharedKey("tramos");
		cliente.setBusinessId("Tania Ramos");
		cliente.setEmail("tramos@gmail.com");
		cliente.setPhone("3219876543");
		cliente.setDateAdded("20/05/2019");
		
		assertEquals(cliente.getSharedKey(), clienteRestController.create(cliente).getSharedKey());
	}

}
