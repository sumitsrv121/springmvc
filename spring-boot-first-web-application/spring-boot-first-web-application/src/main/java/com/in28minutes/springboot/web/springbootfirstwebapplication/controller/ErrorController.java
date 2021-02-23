package com.in28minutes.springboot.web.springbootfirstwebapplication.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Controller("error")
public class ErrorController {
	@ExceptionHandler(Exception.class)
	public ModelAndView exception(HttpServletRequest req, Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("exception", e.getStackTrace());
		mv.addObject("url", req.getRequestURI());
		mv.setViewName("error");
		return mv;
	}
}
