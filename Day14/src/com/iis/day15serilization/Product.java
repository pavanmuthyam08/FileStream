package com.iis.day15serilization;

import java.io.Serializable;

public class Product implements Serializable
{
   private int productid;
   private String productname;
   private double price;
   private int quantity;
   private transient double totalsales;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getTotalsales() {
	return totalsales;
}
public void setTotalsales(double totalsales) {
	this.totalsales = totalsales;
}
}
