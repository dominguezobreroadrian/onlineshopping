package com.ejemplo;

import java.util.ArrayList;
import java.util.List;

import enumeraciones.OrderStatus;
import tipos.Address;
import tipos.Date;

/**
 * Class Order
 */
public class Order {
  
  private String number;
  private Date ordered;
  private Date shipped;
  private Address shipTo;
  private OrderStatus status;
  private double total;
  private List<LineItem> items;
  
  public Order() {
    items = new ArrayList<>();
    
    ordered = new Date();
    status = OrderStatus.NEW;
  }
  
  public Order(String number, Address shipTo) {
    this();
    this.number = number;
    this.shipTo = shipTo;
  }
  
  public String getNumber() { 
    return number; 
  }
  
  public void setNumber(String number) { 
    this.number = number; 
  }
  
  public Date getOrdered() { 
    return ordered; 
  }
  
  public Date getShipped() { 
    return shipped; 
  }
  
  public void setShipped(Date shipped) { 
    this.shipped = shipped; 
  }
  
  public Address getShipTo() { 
    return shipTo; 
  }
  
  public void setShipTo(Address shipTo) { 
    this.shipTo = shipTo; 
  }
  
  public OrderStatus getStatus() { 
    return status; 
  }
  
  public void setStatus(OrderStatus status) { 
    this.status = status; 
  }
  
  public double getTotal() { 
    return total; 
  }
  
  public List<LineItem> getItems() { 
    return items; 
  }
  
  public void addItem(LineItem item) {
    items.add(item);
    recalculateTotal();
  }
  
  public void recalculateTotal() {
    total = items.stream()
    .mapToDouble(i -> i.getPrice() * i.getQuantity())
    .sum();
  
  }

}
