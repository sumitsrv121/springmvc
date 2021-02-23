package com.in28Minutes.sumit.reservationapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.in28Minutes.sumit.reservationapp.model.User;
import com.in28Minutes.sumit.reservationapp.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {
	@Autowired
	private LoginService service;

	@GetMapping(path = "/login")
	public ModelAndView showLoginPage() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", new User());
		mv.setViewName("login");
		return mv;
	}

	@GetMapping(path = "/welcome")
	public ModelAndView showWelcomePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		return mv;
	}

	@PostMapping(path = "/login")
	public String loginUser(@ModelAttribute("user") User user, ModelMap map) {
		boolean isValidUser = service.authenicateUser(user.getUserName(), user.getPassword());
		if (!isValidUser) {
			map.put("error", "Not Valid user");
			return "/login";
		}
		map.put("name", user.getUserName());
		return "welcome";
	}
}
