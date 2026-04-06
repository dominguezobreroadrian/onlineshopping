package com.ejemplo;

import enumeraciones.OrderStatus;
import tipos.Address;
import tipos.Date;

/**
 * Class Order
 */
public class Order {

  //
  // Fields
  //

  private String number;
  private Date ordered;
  private Date shipped;
  private Address ship_to;
  private OrderStatus status;
  private Double total;
  
  //
  // Constructors
  //
  public Order () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of number
   * @param newVar the new value of number
   */
  public void setNumber (String newVar) {
    number = newVar;
  }

  /**
   * Get the value of number
   * @return the value of number
   */
  public String getNumber () {
    return number;
  }

  /**
   * Set the value of ordered
   * @param newVar the new value of ordered
   */
  public void setOrdered (Date newVar) {
    ordered = newVar;
  }

  /**
   * Get the value of ordered
   * @return the value of ordered
   */
  public Date getOrdered () {
    return ordered;
  }

  /**
   * Set the value of shipped
   * @param newVar the new value of shipped
   */
  public void setShipped (Date newVar) {
    shipped = newVar;
  }

  /**
   * Get the value of shipped
   * @return the value of shipped
   */
  public Date getShipped () {
    return shipped;
  }

  /**
   * Set the value of ship_to
   * @param newVar the new value of ship_to
   */
  public void setShip_to (Address newVar) {
    ship_to = newVar;
  }

  /**
   * Get the value of ship_to
   * @return the value of ship_to
   */
  public Address getShip_to () {
    return ship_to;
  }

  /**
   * Set the value of status
   * @param newVar the new value of status
   */
  public void setStatus (OrderStatus newVar) {
    status = newVar;
  }

  /**
   * Get the value of status
   * @return the value of status
   */
  public OrderStatus getStatus () {
    return status;
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

  //
  // Other methods
  //

}
