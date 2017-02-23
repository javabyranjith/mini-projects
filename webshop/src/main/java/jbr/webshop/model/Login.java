package jbr.webshop.model;

import java.util.Date;

public class Login {

  private String username;
  private String password;
  private Date lastlogin;

  public Date getLastlogin() {
    return lastlogin;
  }

  public void setLastlogin(Date lastlogin) {
    this.lastlogin = lastlogin;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
