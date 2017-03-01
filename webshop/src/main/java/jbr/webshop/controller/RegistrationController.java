package jbr.webshop.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jbr.webshop.model.User;
import jbr.webshop.service.UserService;
import jbr.webshop.util.enums.UserType;

@Controller
public class RegistrationController {
  @Autowired
  public UserService userService;

  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("user") User user) {
    ModelAndView mav = new ModelAndView("register");
    mav.addObject("user", new User());

    Map<String, String> userType = new LinkedHashMap<>();
    userType.put("customer", UserType.CUSTOMER.name());
    userType.put("seller", UserType.SELLER.name());

    mav.addObject("userType", userType);

    return mav;
  }

  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("user") User user) {

    userService.register(user);

    return new ModelAndView("welcome", "firstname", user.getFirstname());
  }
}
