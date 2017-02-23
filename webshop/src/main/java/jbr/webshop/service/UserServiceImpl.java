package jbr.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;

import jbr.webshop.dao.UserDao;
import jbr.webshop.model.Login;
import jbr.webshop.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public void register(User user) {
    userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}
