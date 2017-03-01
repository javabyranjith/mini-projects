package jbr.webshop.model;

import jbr.webshop.util.enums.UserType;

public class User {

  private String id;
  private UserType usertype;
  private Login login;
  private String firstname;
  private String lastname;
  private String email;
  private String address;
  private int phone;

  public UserType getUsertype() {
    return usertype;
  }

  public void setUsertype(UserType usertype) {
    this.usertype = usertype;
  }

  public Login getLogin() {
    return login;
  }

  public void setLogin(Login login) {
    this.login = login;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getPhone() {
    return phone;
  }

  public void setPhone(int phone) {
    this.phone = phone;
  }

}
