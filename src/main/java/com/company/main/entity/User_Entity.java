 package com.company.main.entity;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity (name="user")
@Table(name="user")
public class User_Entity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	Integer i;
	
	public User_Entity(String n, String p, String e, Set<Cart_Entity> companies) {
		this.n = n;
		this.p = p;
		this.e = e;
		this.companies = companies;
	}
	
@Column(name="name")
String n;
@Column(name="pwd")
String p;
@Column(name="email")
String e;
@OneToMany(mappedBy="user")
Set<Cart_Entity> companies;

public User_Entity(){
	
}
public Integer getI() {
	return i;
}
public String getN() {
	return n;
}
public void setN(String n) {
	this.n = n;
}
public String getP() {
	return p;
}
public void setP(String p) {
	this.p = p;
}
public String getE() {
	return e;
}
public void setE(String e) {
	this.e = e;
}

}
