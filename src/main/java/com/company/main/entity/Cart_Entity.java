package com.company.main.entity;
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
@Entity (name="cart")
@Table(name="cart")
public class Cart_Entity {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
Integer i;
@Column(name="userid")
Integer n;
@Column(name="productid")
Integer p;
@Column(name="qty")
Integer qty;
@ManyToOne(targetEntity=Items_Entity.class,fetch=FetchType.EAGER)
@JoinColumn(name="productid",insertable=false,updatable=false)
Items_Entity item;

@ManyToOne(targetEntity=User_Entity.class,fetch=FetchType.EAGER)
@JoinColumn(name="userid",insertable=false,updatable=false)
User_Entity user;
public Cart_Entity() {
	
}
public Integer getN() {
	return n;
}
public Integer getI() {
	return i;
}
public void setN(Integer n) {
	this.n = n;
}
public Integer getP() {
	return p;
}
public void setP(Integer p) {
	this.p = p;
}
public Integer getQty() {
	return qty;
}
public void setQty(Integer qty) {
	this.qty = qty;
}
public Items_Entity getItem() {
	return item;
}
public void setItem(Items_Entity item) {
	this.item = item;
}
//public User_Entity getUser() {
//	return user;
//}
public void setUser(User_Entity user) {
	this.user = user;
}
public Cart_Entity(Integer n, Integer p,Integer qty, Items_Entity item, User_Entity user) {
	this.n = n;
	this.p = p;
	this.qty = qty;
	this.item = item;
	this.user = user;
}


}
