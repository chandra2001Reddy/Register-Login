package com.RegisterLogin.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.RegisterLogin.DAO.UserDao;
import com.RegisterLogin.DTO.UserRegistration;

@Controller
public class UserController {
	@Autowired
	UserDao dao;
	
	@RequestMapping("/registration")
	public ModelAndView registerUser() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",new UserRegistration());
		mv.setViewName("Registration.jsp");
		return mv;
	}
	
	@RequestMapping("/save")
	public ModelAndView saveUser(@ModelAttribute UserRegistration user) {
		dao.saveUser(user);
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",new UserRegistration());
		mv.setViewName("/login");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView loginUser() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",new UserRegistration());
		mv.setViewName("Login.jsp");
		return mv;
	}
	
	@RequestMapping("/validate")
	public ModelAndView loginValidateUser(@ModelAttribute UserRegistration user) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",new UserRegistration());
		mv.setViewName("home.jsp");
		return mv;
	}
	
}
