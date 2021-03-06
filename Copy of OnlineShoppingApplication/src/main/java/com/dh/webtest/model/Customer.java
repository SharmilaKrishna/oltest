package com.dh.webtest.model;

import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int customerId;

	@Column(name = "firstname")
	String firstName;
	
	
	@Column(name = "lastname")
	String lastName;
	


	@Column(name = "emailId")
	String emailId;
	
@Column(name = "username")
	String userName;
	
	@Column(name = "password")
	String password;
	
	
	@Column(name = "role")
	String role;
	
	
	/*
	@OneToMany(mappedBy = "user",  orphanRemoval = true)
	List<Authority> authority;*/
	





	@OneToMany(mappedBy = "customer",  orphanRemoval = true)
	List<ShippingAddress> shippingAddress;
	
	
	@OneToMany(mappedBy = "customer", orphanRemoval = true)
	List<Cart> cart;

	@OneToMany(mappedBy = "customer", orphanRemoval = true)
	List<Order> order;
	/*
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	User user;
	*/
	

	

	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	

	

	public List<ShippingAddress> getShippingAddress() {
		return shippingAddress;
	}


	public void setShippingAddress(List<ShippingAddress> shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	/*public void setAuthority(List<Authority> authority) {
		this.authority = authority;
	}
	public List<Authority> getAuthority() {
		return authority;
	}*/

	public List<Cart> getCart() {
		return cart;
	}


	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}


	public List<Order> getOrder() {
		return order;
	}


	public void setOrder(List<Order> order) {
		this.order = order;
	}
	


	@Override
	public String toString() {
		String str = this.customerId+ " " + this.firstName +" "+this.lastName+ " "+this.emailId+    " " + this.userName + " " + this.password+ "\n";

		return str;

	}
	
	


}


