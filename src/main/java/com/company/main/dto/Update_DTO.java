package com.company.main.dto;

public class Update_DTO {
	String items;String funct;String specs;Integer price;Integer id;
public Update_DTO(String items, String funct, String specs, Integer price,Integer id) {
		this.items = items;
		this.funct = funct;
		this.specs = specs;
		this.price = price;this.id=id;
	}
public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public String getFunct() {
		return funct;
	}
	public void setFunct(String funct) {
		this.funct = funct;
	}
	public String getSpecs() {
		return specs;
	}
	public void setSpecs(String specs) {
		this.specs = specs;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
public Update_DTO() {
	
}

	
}
