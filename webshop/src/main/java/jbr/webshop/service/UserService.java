package jbr.webshop.service;

import jbr.webshop.model.Login;
import jbr.webshop.model.User;

public interface UserService {

  void register(User user);

  User validateUser(Login login);
}
