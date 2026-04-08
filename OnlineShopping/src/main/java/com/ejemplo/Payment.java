package com.ejemplo;

import tipos.Date;

/**
 * Class Payment
 */
public class Payment {

  private String id;
  private Date paid;
  private double total;
  private String details;
  
  public Payment() {}
  
  public Payment(String id, double total, String details, Date paid) {
    this.id = id;
    this.total = total;
    this.details = details;
    this.paid = paid;
  }
  
  public String getId() { 
    return id; 
  }
  
  public void setId(String id) { 
    this.id = id; 
  }
  
  public Date getPaid() { 
    return paid; 
  }
  
  public double getTotal() { 
    return total; 
  }
  
  public void setTotal(double total) { 
    this.total = total; 
  }
  
  public String getDetails() { 
    return details; 
  }
  
  public void setDetails(String details) { 
    this.details = details; 
  }

}
