package com.project.OS.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AddProduct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int proudctId;
	private String productName;
	private double price;
	private String stock;
	public int getProudctId() {
		return proudctId;
	}
	public void setProudctId(int proudctId) {
		this.proudctId = proudctId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public AddProduct(int proudctId, String productName, double price, String stock) {
		super();
		this.proudctId = proudctId;
		this.productName = productName;
		this.price = price;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "AddProduct [proudctId=" + proudctId + ", productName=" + productName + ", price=" + price + ", stock="
				+ stock + "]";
	}
	public AddProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
