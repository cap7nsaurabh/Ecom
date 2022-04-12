package com.ecom.web.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class User {
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	@Column(unique=true)
	private String emailId;
	private String fname;
	private String lname;
	private String password;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	@JsonIgnore
	private List<CartItem> itemLists;
	
	
	
	
	public User(String emailId, String fname, String lname, String password) {
		super();
		this.emailId = emailId;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
