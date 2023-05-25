package com.dem.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue
	int  productid;
	@Column(length = 15)
	String prodname;
	@Column(length = 15)
	String catagory;
	int quantity;
	int price;
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", prodname=" + prodname + ", catagory=" + catagory + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
	public Product() {
	}
	public Product(int productid, String prodname, String catagory, int quantity, int price) {
		this.productid = productid;
		this.prodname = prodname;
		this.catagory = catagory;
		this.quantity = quantity;
		this.price = price;
	}
	public Product(String prodname, String catagory, int quantity, int price) {
		this.prodname = prodname;
		this.catagory = catagory;
		this.quantity = quantity;
		this.price = price;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
