package com.ejemplo;

import tipos.Date;

/**
 * Class Payment
 */
public class Payment {

  //
  // Fields
  //

  private String id;
  private Date paid;
  private Double total;
  private String details;
  
  //
  // Constructors
  //
  public Payment () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (String newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public String getId () {
    return id;
  }

  /**
   * Set the value of paid
   * @param newVar the new value of paid
   */
  public void setPaid (Date newVar) {
    paid = newVar;
  }

  /**
   * Get the value of paid
   * @return the value of paid
   */
  public Date getPaid () {
    return paid;
  }

  /**
   * Set the value of total
   * @param newVar the new value of total
   */
  public void setTotal (Double newVar) {
    total = newVar;
  }

  /**
   * Get the value of total
   * @return the value of total
   */
  public Double getTotal () {
    return total;
  }

  /**
   * Set the value of details
   * @param newVar the new value of details
   */
  public void setDetails (String newVar) {
    details = newVar;
  }

  /**
   * Get the value of details
   * @return the value of details
   */
  public String getDetails () {
    return details;
  }

  //
  // Other methods
  //

}
