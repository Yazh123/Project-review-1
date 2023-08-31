package com.example.demo.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToOne;

@Entity
public class Count {

	@Id
	@GeneratedValue
	private int countid;
	private int dquantity;
	private int squantity;
	private int mquantity;
	public int getCountid() {
		return countid;
	}
	public void setCountid(int countid) {
		this.countid = countid;
	}
	public int getDquantity() {
		return dquantity;
	}
	public void setDquantity(int dquantity) {
		this.dquantity = dquantity;
	}
	public int getSquantity() {
		return squantity;
	}
	public void setSquantity(int squantity) {
		this.squantity = squantity;
	}
	public int getMquantity() {
		return mquantity;
	}
	public void setMquantity(int mquantity) {
		this.mquantity = mquantity;
	}
	public Count() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Count(int countid, int dquantity, int squantity, int mquantity) {
		super();
		this.countid = countid;
		this.dquantity = dquantity;
		this.squantity = squantity;
		this.mquantity = mquantity;
	}
	
	
	
}
