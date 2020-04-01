package com.project.stage;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int id;
	private String FirstName;
	private String LastName;
	private String email;
	private String PassWord;
	List<Coupon> coupons = new ArrayList<Coupon>();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FirstName == null) ? 0 : FirstName.hashCode());
		result = prime * result + ((LastName == null) ? 0 : LastName.hashCode());
		result = prime * result + ((PassWord == null) ? 0 : PassWord.hashCode());
		result = prime * result + ((coupons == null) ? 0 : coupons.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
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
		Customer other = (Customer) obj;
		if (FirstName == null) {
			if (other.FirstName != null)
				return false;
		} else if (!FirstName.equals(other.FirstName))
			return false;
		if (LastName == null) {
			if (other.LastName != null)
				return false;
		} else if (!LastName.equals(other.LastName))
			return false;
		if (PassWord == null) {
			if (other.PassWord != null)
				return false;
		} else if (!PassWord.equals(other.PassWord))
			return false;
		if (coupons == null) {
			if (other.coupons != null)
				return false;
		} else if (!coupons.equals(other.coupons))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customers [id =" + id + ", FirstName =" + FirstName + ", LastName =" + LastName + ", email =" + email
				+ ", PassWord =" + PassWord + "]";
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return PassWord;
	}

	public void setPassWord(String passWord) {
		PassWord = passWord;
	}

	public List<Coupon> getCoupons() {
		// this function is supposed to hold all of the coupons that the current
		// customer is holding;
		return coupons;
	}

	public Customer(String firstName, String lastName, String email, String passWord, List<Coupon> coupons) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		PassWord = passWord;
		this.coupons = coupons;
	}

}
