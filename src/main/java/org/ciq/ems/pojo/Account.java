package org.ciq.ems.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "account_number", nullable = false, unique = true)
	private Long accountNumber;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	
	public Account(Long accountNumber, String city, String state) {
		super();
		this.accountNumber = accountNumber;
		this.city = city;
		this.state = state;
	}


	public Account(int id, Long accountNumber, String city, String state) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.city = city;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
