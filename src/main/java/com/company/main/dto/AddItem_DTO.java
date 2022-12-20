package com.company.main.dto;

public class AddItem_DTO {
String items;String fun;String specs;Integer price;

public String getItems() {
	return items;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
public void setItems(String items) {
	this.items = items;
}

public String getFun() {
	return fun;
}

public void setFunction(String fun) {
	this.fun = fun;
}

public String getSpecs() {
	return specs;
}

public void setSpecs(String specs) {
	this.specs = specs;
}

public AddItem_DTO(String items, String fun, String specs,Integer price) {
	this.price=price;
	this.items = items;
	this.fun = fun;
	this.specs = specs;
}
public AddItem_DTO() {
	
}
}
