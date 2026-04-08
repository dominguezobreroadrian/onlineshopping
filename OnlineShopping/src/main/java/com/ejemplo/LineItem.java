package com.ejemplo;

/**
 * Class LineItem
 */
public class LineItem {

  	private int quantity;
	private double price;
	private Product product;
	
	public LineItem() {}
	
	public LineItem(Product product, int quantity, double price) {
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}
	
	public int getQuantity() { 
		return quantity; 
	}
	
	public void setQuantity(int quantity) { 
		this.quantity = quantity; 
	}
	
	public double getPrice() { 
		return price; 
	}
	
	public void setPrice(double price) { 
		this.price = price; 
	}
	
	public Product getProduct() { 
		return product; 
	}
	
	public void setProduct(Product product) { 
		this.product = product; 
	}
	
	public double getSubtotal() {
		return quantity * price;
	}
}
