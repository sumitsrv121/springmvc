package com.in28Minutes.sumit.reservationapp.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean authenicateUser(String userName, String password) {
		return userName.equalsIgnoreCase("admin") && password.equals("admin");
	}
}
