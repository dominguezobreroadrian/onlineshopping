package com.ejemplo;

/**
 * Class LineItem
 */
public class LineItem {

  //
  // Fields
  //

  private Integer quantity;
  private double price;
  
  //
  // Constructors
  //
  public LineItem () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of quantity
   * @param newVar the new value of quantity
   */
  public void setQuantity (Integer newVar) {
    quantity = newVar;
  }

  /**
   * Get the value of quantity
   * @return the value of quantity
   */
  public Integer getQuantity () {
    return quantity;
  }

  /**
   * Set the value of price
   * @param newVar the new value of price
   */
  public void setPrice (double newVar) {
    price = newVar;
  }

  /**
   * Get the value of price
   * @return the value of price
   */
  public double getPrice () {
    return price;
  }

  //
  // Other methods
  //
  
  public double getSubtotal() {
	  return quantity * price;
  }

}
