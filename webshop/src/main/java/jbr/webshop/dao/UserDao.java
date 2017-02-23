package jbr.webshop.dao;

import jbr.webshop.model.Login;
import jbr.webshop.model.User;

public interface UserDao {

  void register(User user);

  User validateUser(Login login);
}
