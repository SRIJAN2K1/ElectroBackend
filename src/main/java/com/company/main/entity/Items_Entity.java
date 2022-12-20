package com.company.main.entity;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity(name="items_1")
@Table(name="items_1")
public class Items_Entity {

	public String toString() {
		return "Items_Entity [i=" + i + ", n=" + n + ", f=" + f + ", s=" + s + ", companies=" + cart + "]";
	}
	public Items_Entity() {
		
	}
	public Items_Entity( String n, String f, String s,Integer p, Set<Cart_Entity> cart) {
		this.n = n;
		this.f = f;
		this.s = s;
		this.cart = cart;
		this.p=p;
	}
	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

//	public Set<Company_Entity> getCompany() {
//		return com;
//	}

	public void setCompany(Set<Cart_Entity> cart) {
		this.cart = cart;
	}
	public Integer getI() {
		return i;
	}
	public void setPrice(Integer p) {
		this.p = p;
	}
	public Integer getPrice() {
		return p;
	}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
Integer i;
@Column(name="items")
String n;
@Column(name="funct")
String f;
@Column(name="specs")
String s;
@Column(name="price")
Integer p;
@OneToMany(mappedBy="item")
Set<Cart_Entity> cart;
}
