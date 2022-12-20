package com.company.main.dto;

public class AddCart_DTO {
public AddCart_DTO(int id, int productid, int qty) {
		this.uid = id;
		this.productid = productid;
		this.qty = qty;
	}
int uid;int productid;int qty;
public int getUid() {
	return uid;
}
public void setId(int id) {
	this.uid = id;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
}
