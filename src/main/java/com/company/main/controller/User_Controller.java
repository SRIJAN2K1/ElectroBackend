package com.company.main.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.main.dto.User_DTO;
import com.company.main.entity.User_Entity;
import com.company.main.service.User_Implement;

@RestController
@RequestMapping("/User")
//@CrossOrigin(origins="http://localhost:4200")
public class User_Controller {
User_Implement user;

@Autowired
public User_Controller(User_Implement user) {
	this.user = user;
}
@PostMapping("/login")
public void addUser(@RequestBody User_DTO users){
this.user.save(users);
}
@PostMapping("/get")
public User_Entity getId(@RequestBody User_DTO users){
return user.getUid(users);
}
@PostMapping("/check")
public User_Entity save(@RequestBody User_DTO users) {
	return user.save(users);
}
}