package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "emi_card")
public class EMICard {
	
	@Id
	@Column(name = "reg_no", length = 16)
	private String cardNo;
	
	@Column(name = "issue_date", length = 20)
	private String issueDate;
	
	@Column(name = "expiry_date", length = 20)
	private String expiryDate;
	
	@Column(name = "emi_limit", length = 20)
	private double emiLimit;

	@OneToOne
	@JoinColumn(name = "uname")
	User user;
//	@OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
//	private List<Product> products = new ArrayList<Product>();



	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}


	public String getIssuedate() {
		return issueDate;
	}


	public void setIssuedate(String issuedate) {
		this.issueDate = issuedate;
	}


	public String getExpirydate() {
		return expiryDate;
	}


	public void setExpirydate(String expirydate) {
		this.expiryDate = expirydate;
	}


//	public User getU() {
//		return u;
//	}
//
//
//	public void setU(User u) {
//		this.u = u;
//	}


//	public List<Product> getProducts() {
//		return products;
//	}
//
//
//	public void setProducts(List<Product> products) {
//		this.products = products;
//	}


	public double getEmilimit() {
		return emiLimit;
	}


	public void setEmilimit(double emilimit) {
		this.emiLimit = emilimit;
	}


}