package clientes;

import enumeraciones.UserState;

/**
 * Class Web_User
 */
public class Web_User {
	

  //
  // Fields
  //

  private String login_id;
  private String password;
  private UserState state;
  
  //
  // Constructors
  //
  public Web_User () { };
  
  public Web_User(String login_id, String password, UserState state) {
      this.login_id = login_id;
      this.password = password;
      this.state = state;
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of login_id
   * @param newVar the new value of login_id
   */
  public void setLogin_id (String newVar) {
    login_id = newVar;
  }

  /**
   * Get the value of login_id
   * @return the value of login_id
   */
  public String getLogin_id () {
    return login_id;
  }

  /**
   * Set the value of password
   * @param newVar the new value of password
   */
  public void setPassword (String newVar) {
    password = newVar;
  }

  /**
   * Get the value of password
   * @return the value of password
   */
  public String getPassword () {
    return password;
  }

  /**
   * Set the value of state
   * @param newVar the new value of state
   */
  public void setState (UserState newVar) {
    state = newVar;
  }

  /**
   * Get the value of state
   * @return the value of state
   */
  public UserState getState () {
    return state;
  }
  
  public boolean isActive() {
      return state == UserState.ACTIVE;
  }

}
