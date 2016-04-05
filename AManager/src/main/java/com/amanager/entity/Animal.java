/**
 * 
 */
package com.amanager.entity;

import org.springframework.data.annotation.Id;

/**
 * @author geci
 *
 */
public class Animal {

	@Id
	private String id;

	private String firstName;
	private String lastName;

	public Animal() {
	}

	public Animal(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
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

	@Override
	public String toString() {
		return "Animal [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
