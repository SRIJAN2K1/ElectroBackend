package com.company.main.dto;
public class User_DTO {
String name;String email;String pwd;String user;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public void setUser(String user) {
	this.user=user;
}
public String getUser() {
	return user;
}
public User_DTO(String user,String name, String email, String pwd)
{
    this.user=user;
	this.name = name;
	this.email = email;
	this.pwd = pwd;
}
public User_DTO() {
	
}
}
