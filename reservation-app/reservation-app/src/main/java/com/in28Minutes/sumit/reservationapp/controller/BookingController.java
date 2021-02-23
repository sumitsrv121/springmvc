package com.in28Minutes.sumit.reservationapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.in28Minutes.sumit.reservationapp.model.Booking;
import com.in28Minutes.sumit.reservationapp.service.BookingService;

@Controller
@SessionAttributes("name")
public class BookingController {
	@Autowired
	private BookingService service;

	@GetMapping(path = "/booking")
	public ModelAndView showBookingPage() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("booking", new Booking());
		mv.setViewName("booking");
		return mv;
	}

	@PostMapping(path = "/booking")
	public String showDetailPage(@ModelAttribute("booking") Booking booking, ModelMap map) {
		booking.setBookingId(service.generateBookingId());
		map.addAttribute("booking", booking);
		System.out.println("name*********************************" + map.get("name"));
		return "details";
	}
}
