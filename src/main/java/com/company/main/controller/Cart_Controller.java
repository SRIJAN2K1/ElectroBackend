package com.company.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.main.dto.AddCart_DTO;
import com.company.main.dto.Cart_DTO;
import com.company.main.dto.Pid_DTO;
import com.company.main.entity.Cart_Entity;
import com.company.main.service.Cart_Service;
@RestController
@RequestMapping("/place")
public class Cart_Controller {
	@Autowired
	Cart_Service cart;
	
@PostMapping("/order")
public List<Cart_Entity> addCart(@RequestBody AddCart_DTO add){
return cart.addCart(add);
}
@PostMapping("/delete")
List<Cart_Entity> removeCart(@RequestBody Pid_DTO pid){
	System.out.println(pid.getId());
	return cart.delete(pid);
}
@PostMapping("/display")
List<Cart_Entity> display(@RequestBody Cart_DTO car){
	return cart.display(car);
}
@PostMapping("/button")
List<Cart_Entity> xyz(@RequestBody AddCart_DTO add){
	return cart.updateButton(add);
}
}
