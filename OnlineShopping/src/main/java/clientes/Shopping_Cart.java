package clientes;

import com.ejemplo.Account;

import tipos.Date;

/**
 * Class Shopping_Cart_
 */
public class Shopping_Cart {

  //
  // Fields
  //

  private Date created;
  private Account nuevo_atributo;
  
  //
  // Constructors
  //
  public Shopping_Cart () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of created
   * @param newVar the new value of created
   */
  public void setCreated (Date newVar) {
    created = newVar;
  }

  /**
   * Get the value of created
   * @return the value of created
   */
  public Date getCreated () {
    return created;
  }

  /**
   * Set the value of nuevo_atributo
   * @param newVar the new value of nuevo_atributo
   */
  public void setNuevo_atributo (Account newVar) {
    nuevo_atributo = newVar;
  }

  /**
   * Get the value of nuevo_atributo
   * @return the value of nuevo_atributo
   */
  public Account getNuevo_atributo () {
    return nuevo_atributo;
  }

  //
  // Other methods
  //

}
