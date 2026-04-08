package com.ejemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tipos.Address;
import tipos.Date;

public class AccountTest {
	@Test
	void testGetOpen() {
		Address address = new Address("Calle bacalao", "Sevilla", "41015");
		Date date = new Date(2,2,2026);
		Account account = new Account("1", address, date);
		
		int resultado = account.getOpen().getMonth();
		int resultadoEsperado = 2;
		
		assertEquals(resultadoEsperado, resultado);
	}
}
