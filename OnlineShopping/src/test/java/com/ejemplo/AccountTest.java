package com.ejemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tipos.Address;
import tipos.Date;

public class AccountTest {
	private Address address;
	private Date date;
	private Account account;
	
	
	@BeforeEach
	void setUp() {
		address = new Address("Calle bacalao", "Sevilla", "41015");
		date = new Date(2,2,2026);
		account = new Account("1", address, date);
	}
	
	@Test
	void testGetOpen() {
		int resultado = account.getOpen().getMonth();
		int resultadoEsperado = 2;
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testSetOpen() {
		Date date2 = new Date(12,6,2026);
		
		account.setOpen(date2);
		
		int resultado = account.getOpen().getDay();
		int resultadoEsperado = 12;
		
		assertEquals(resultadoEsperado, resultado);
		
	}
	
	@Test
	void testAddOrder() {
		Order order = new Order("26", address);
		account.addOrder(order);
		
		String resultado = account.getOrders().get(0).getNumber();
		String resultadoEsperado = "26";
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testAddPayment() {
		Payment pay = new Payment("15", 1300, "Pagar urgentemente", date);
		account.addPayment(pay);
		
		String resultado = account.getPayments().get(0).getDetails();
		String resultadoEsperado = "Pagar urgentemente";
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testGetTotalPayments() {
		Payment pay = new Payment("15", 1300, "Pagar urgentemente", date);
		account.addPayment(pay);
		
		double resultado = account.getTotalPayments();
		double resultadoEsperado = 1300;
		
		assertEquals(resultadoEsperado, resultado, 0.001);
	}
		
}
