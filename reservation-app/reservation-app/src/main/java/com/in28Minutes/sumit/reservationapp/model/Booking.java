package com.in28Minutes.sumit.reservationapp.model;

import java.util.Arrays;

public class Booking {
	private long bookingId;
	private String firstName;
	private String lastName;
	private String gender;
	private String[] food;
	private String leavingFrom;
	private String goingTo;

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(long bookingId, String firstName, String lastName, String gender, String[] food, String leavingFrom,
			String goingTo) {
		super();
		this.bookingId = bookingId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.food = food;
		this.leavingFrom = leavingFrom;
		this.goingTo = goingTo;
	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getFood() {
		return food;
	}

	public void setFood(String[] food) {
		this.food = food;
	}

	public String getLeavingFrom() {
		return leavingFrom;
	}

	public void setLeavingFrom(String leavingFrom) {
		this.leavingFrom = leavingFrom;
	}

	public String getGoingTo() {
		return goingTo;
	}

	public void setGoingTo(String goingTo) {
		this.goingTo = goingTo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (bookingId ^ (bookingId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		if (bookingId != other.bookingId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", food=" + Arrays.toString(food) + ", leavingFrom=" + leavingFrom + ", goingTo=" + goingTo
				+ "]";
	}

}
