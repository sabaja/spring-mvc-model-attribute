package com.mvc.modelattribute.domain;


public class Employee {
	
	private long id;
	private String name;
	private String contactNumber;
	
	public Employee() {
		super();
	}

	public Employee(long id, String name, String contactNumber) {
		super();
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contactNumber=" + contactNumber + "]";
	}

	
}
