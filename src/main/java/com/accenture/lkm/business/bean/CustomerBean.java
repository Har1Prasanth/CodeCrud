package com.accenture.lkm.business.bean;

import java.util.Date;


public class CustomerBean{
	
	
	private int customerId;
	private String customerName;
	private Double billAmount;
	private Date billDate;
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public Double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}

	public CustomerBean() {
		super();
	}
	public CustomerBean(int customerId, String customerName, Double billAmount, Date billDate) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.billAmount = billAmount;
		this.billDate = billDate;
	}
}
	