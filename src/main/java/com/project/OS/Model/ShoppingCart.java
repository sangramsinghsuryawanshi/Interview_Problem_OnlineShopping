package com.project.OS.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShoppingCart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String serchaProductName;
	private double sPrice;
	private String sStock;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSerchaProductName() {
		return serchaProductName;
	}
	public void setSerchaProductName(String serchaProductName) {
		this.serchaProductName = serchaProductName;
	}
	public double getsPrice() {
		return sPrice;
	}
	public void setsPrice(double sPrice) {
		this.sPrice = sPrice;
	}
	public String getsStock() {
		return sStock;
	}
	public void setsStock(String sStock) {
		this.sStock = sStock;
	}
	@Override
	public String toString() {
		return "ShoppingCart [sid=" + sid + ", serchaProductName=" + serchaProductName + ", sPrice=" + sPrice
				+ ", sStock=" + sStock + "]";
	}
	public ShoppingCart(int sid, String serchaProductName, double sPrice, String sStock) {
		super();
		this.sid = sid;
		this.serchaProductName = serchaProductName;
		this.sPrice = sPrice;
		this.sStock = sStock;
	}
	public ShoppingCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
