package com.company.main.dto;

public class Pid_DTO {
Integer productid;Integer id;Integer uid;
public Pid_DTO() {
	
}
public Pid_DTO(Integer productid,Integer id,Integer uid) {
	this.productid = productid;this.id=id;this.uid=uid;
}

public Integer getProductid() {
	return productid;
}

public void setProductid(Integer productid) {
	this.productid = productid;
}
public Integer getUid() {
	return uid;
}

public void setUid(Integer uid) {
	this.uid = uid;
}
public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}
}
