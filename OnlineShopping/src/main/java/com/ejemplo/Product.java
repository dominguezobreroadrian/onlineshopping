package com.ejemplo;

import tipos.Supplier;

/**
 * Class Product
 */
public class Product {

  //
  // Fields
  //

  private String id;
  private String name;
  private Supplier supplier;
  
  //
  // Constructors
  //
  public Product () { };
  
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
   * Set the value of name
   * @param newVar the new value of name
   */
  public void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  public String getName () {
    return name;
  }

  /**
   * Set the value of supplier
   * @param newVar the new value of supplier
   */
  public void setSupplier (Supplier newVar) {
    supplier = newVar;
  }

  /**
   * Get the value of supplier
   * @return the value of supplier
   */
  public Supplier getSupplier () {
    return supplier;
  }

  //
  // Other methods
  //

}
