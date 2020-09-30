package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@NamedQuery(name = "fetchifyes", query = "select u from User u where u.approvalStatus=:approvalStatus")
public class User {
	
	@Id
	@Column(name = "uname",length=15)
	private String uName;
	
	@Column(name = "uemail",length=25)
	private String uEmail;
	
	@Column(name = "upwd",length=15)
	private String uPwd;
	
	@Column(name = "ucontact",length=15)
	private String uContact;
	
	@Column(name = "name",length=15)
	private String Name;
	
	@Column(name = "ubankacct",length=16)
	private String uBankAcct;
	
	@Column(name = "uifsc",length=15)
	private String uIfsc;
	
	@Column(name = "uaddress",length=30)
	private String uAddress;
	
	@Column(name = "ubank",length=15)
	private String uBank;
	
	@Column(name = "ucardtype",length=15)
	private String uCardType;
	
	@Column(name = "status",length=15)
	private String approvalStatus;

	@OneToMany(mappedBy = "user", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	private List<Order> ord = new ArrayList<Order>();

	public String getUname() {
		return uName;
	}

	public void setUname(String uname) {
		this.uName = uname;
	}

	public String getUemail() {
		return uEmail;
	}

	public void setUemail(String uemail) {
		this.uEmail = uemail;
	}

	public String getUpwd() {
		return uPwd;
	}

	public void setUpwd(String upwd) {
		this.uPwd = upwd;
	}

	public String getUcontact() {
		return uContact;
	}

	public void setUcontact(String ucontact) {
		this.uContact = ucontact;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getUbankacct() {
		return uBankAcct;
	}

	public void setUbankacct(String ubankacct) {
		this.uBankAcct = ubankacct;
	}

	public String getUifsc() {
		return uIfsc;
	}

	public void setUifsc(String uifsc) {
		this.uIfsc = uifsc;
	}

	public String getUaddress() {
		return uAddress;
	}

	public void setUaddress(String uaddress) {
		this.uAddress = uaddress;
	}

	public String getUcardtype() {
		return uCardType;
	}

	public void setUcardtype(String ucardtype) {
		this.uCardType = ucardtype;
	}

	public String getApprovalstatus() {
		return approvalStatus;
	}

	public void setApprovalstatus(String approvalstatus) {
		this.approvalStatus = approvalstatus;
	}

	public List<Order> getOrd() {
		return ord;
	}

	public void setOrd(List<Order> ord) {
		this.ord = ord;
	}

	public String getBank() {
		return uBank;
	}

	public void setBank(String bank) {
		this.uBank = bank;
	}

}