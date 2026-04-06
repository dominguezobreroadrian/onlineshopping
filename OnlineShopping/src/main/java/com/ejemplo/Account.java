package com.ejemplo;

import tipos.Address;
import tipos.Date;

/**
 * Class Account
 */
public class Account {

  //
  // Fields
  //

  private String id;
  private Address billing_address;
  private Boolean is_closed;
  private Date open;
  private Date closed;
  private Order nuevo_atributo_1;
  
  //
  // Constructors
  //
  public Account () { };
  
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
   * Set the value of billing_address
   * @param newVar the new value of billing_address
   */
  public void setBilling_address (Address newVar) {
    billing_address = newVar;
  }

  /**
   * Get the value of billing_address
   * @return the value of billing_address
   */
  public Address getBilling_address () {
    return billing_address;
  }

  /**
   * Set the value of is_closed
   * @param newVar the new value of is_closed
   */
  public void setIs_closed (Boolean newVar) {
    is_closed = newVar;
  }

  /**
   * Get the value of is_closed
   * @return the value of is_closed
   */
  public Boolean getIs_closed () {
    return is_closed;
  }

  /**
   * Set the value of open
   * @param newVar the new value of open
   */
  public void setOpen (Date newVar) {
    open = newVar;
  }

  /**
   * Get the value of open
   * @return the value of open
   */
  public Date getOpen () {
    return open;
  }

  /**
   * Set the value of closed
   * @param newVar the new value of closed
   */
  public void setClosed (Date newVar) {
    closed = newVar;
  }

  /**
   * Get the value of closed
   * @return the value of closed
   */
  public Date getClosed () {
    return closed;
  }

  /**
   * Set the value of nuevo_atributo_1
   * @param newVar the new value of nuevo_atributo_1
   */
  public void setNuevo_atributo_1 (Order newVar) {
    nuevo_atributo_1 = newVar;
  }

  /**
   * Get the value of nuevo_atributo_1
   * @return the value of nuevo_atributo_1
   */
  public Order getNuevo_atributo_1 () {
    return nuevo_atributo_1;
  }

  //
  // Other methods
  //

}
