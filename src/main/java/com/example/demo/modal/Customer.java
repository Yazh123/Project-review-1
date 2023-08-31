package com.example.demo.modal;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import jakarta.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue
    private int id;
    private String name;
    private int age;
    private String address;
    private String mailid;
	
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
	private List<Menu> menu;


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="countid")
	private Count cs;


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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getMailid() {
		return mailid;
	}


	public void setMailid(String mailid) {
		this.mailid = mailid;
	}


	public List<Menu> getMenu() {
		return menu;
	}


	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}


	public Count getCs() {
		return cs;
	}


	public void setCs(Count cs) {
		this.cs = cs;
	}


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(int id, String name, int age, String address, String mailid, List<Menu> menu, Count cs) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.mailid = mailid;
		this.menu = menu;
		this.cs = cs;
	}
	
	
}
