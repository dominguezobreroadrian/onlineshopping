package clientes;

import com.ejemplo.Account;

import tipos.Address;
import tipos.Phone;

/**
 * Class Customer
 */
public class Customer {

  //
  // Fields
  //

  private String id;
  private Address address;
  private Phone phone;
  private String email;
  private Account account;
  
  //
  // Constructors
  //
  public Customer () { };
  
  public Customer(String id, Address address, Phone phone, String email) {
      this.id = id;
      this.address = address;
      this.phone = phone;
      this.email = email;
  }


  /**
   * Get the value of id
   * @return the value of id
   */
  public String getId () {
    return id;
  }


  /**
   * Get the value of address
   * @return the value of address
   */
  public Address getAddress () {
    return address;
  }


  /**
   * Get the value of phone
   * @return the value of phone
   */
  public Phone getPhone () {
    return phone;
  }


  /**
   * Get the value of email
   * @return the value of email
   */
  public String getEmail () {
    return email;
  }


  /**
   * Get the value of nuevo_atributo
   * @return the value of nuevo_atributo
   */
  public Account getNuevo_atributo () {
    return account;
  }


}
