package com.in28Minutes.sumit.reservationapp.service;

import org.springframework.stereotype.Service;

@Service
public class BookingService {
	public long generateBookingId() {
		return (long) (Math.random() * (100000000 - 100 + 1) + 100);
	}
}
