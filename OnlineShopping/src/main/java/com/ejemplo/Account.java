package com.ejemplo;

import java.util.ArrayList;
import java.util.List;

import tipos.Address;
import tipos.Date;

/**
 * Class Account
 */
public class Account {

	private String id;
    private Address billingAddress;
    private boolean isClosed;
    private Date open;
    private Date closed;

    private List<Order> orders;
    private List<Payment> payments;

    public Account() {
        orders = new ArrayList<>();
        payments = new ArrayList<>();
    }

    public Account(String id, Address billingAddress, Date open) {
        this();
        this.id = id;
        this.billingAddress = billingAddress;
        this.open = open;
    }

    public String getId() {
    	return id; 
    }
    
    public void setId(String id) { 
    	this.id = id; 
    }

    public Address getBillingAddress() { 
    	return billingAddress; 
    }
    
    public void setBillingAddress(Address billingAddress) {
    	this.billingAddress = billingAddress; 
    }

    public boolean isClosed() { 
    	return isClosed; 
    }
    
    public void setClosed(boolean closed) { 
    	isClosed = closed; 
    }

    public Date getOpen() { 
    	return open; 
    }
    
    public void setOpen(Date open) { 
    	this.open = open; 
    }

    public Date getClosed() { 
    	return closed; 
    }
    
    public void setClosedDate(Date closed) { 
    	this.closed = closed; 
    }

    public List<Order> getOrders() { 
    	return orders; 
    }

    public List<Payment> getPayments() { 
    	return payments; 
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public double getTotalPayments() {
        return payments.stream().mapToDouble(Payment::getTotal).sum();
    }

}
