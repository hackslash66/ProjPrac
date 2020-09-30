package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "orders")
public class Order {

	@Id
	@Column(name = "Order_id")
	private int orderID;
	
	@ManyToOne
	@JoinColumn(name = "uname")
	private User user;

	

	@ManyToOne
	@JoinColumn(name = "pID")
	private Product product;


	public int getO_id() {
		return orderID;
	}


	public void setO_id(int o_id) {
		this.orderID = o_id;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Product getProd() {
		return product;
	}


	public void setProd(Product prod) {
		this.product = prod;
	}
}