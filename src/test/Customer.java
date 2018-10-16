package test;

import java.io.*;
import java.util.*;

public class Customer {

	private int id;
	private String firstname;
	private String lastname;
	private String street;
	private String city;

	public String toString() {
		return id + "  " + firstname + "   " + lastname;
	}

	public int getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
