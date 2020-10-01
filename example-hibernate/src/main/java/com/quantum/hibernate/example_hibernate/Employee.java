package com.quantum.hibernate.example_hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table(name="Emp_hibernate")
public class Employee {
	
	@Id
	@Column(name="id")
	@GeneratedValue(generator = "Incrementor")
    private int id;
	
	@Column(name="name")
	private String name;
	
    @Column(name="country")
  	private String country;

    
    

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getcountry() {
		return country;
	}
	public void setcountry(String country) {
		this.country = country;
	}

	

}
