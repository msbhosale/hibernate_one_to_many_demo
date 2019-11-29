package com.msbhosale.hibernate.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Person {

	@Id
	private int id;
	private String firstName;
	private String lastName;

	@OneToMany
	@JoinColumn(name = "laptop_id")
	private List<Laptop> laptop = new ArrayList<Laptop>();

	public Person() {

	}

	public Person(int id, String firstName, String lastName) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", laptop=" + laptop + "]";
	}

}