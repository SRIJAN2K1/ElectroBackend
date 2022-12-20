package com.company.main.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.main.dto.AddItem_DTO;
import com.company.main.dto.SearchItem_DTO;
import com.company.main.dto.Update_DTO;
import com.company.main.dto.User_DTO;
import com.company.main.entity.Cart_Entity;
import com.company.main.entity.Items_Entity;
import com.company.main.service.Cart_Implement;
import com.company.main.service.Items_Implement;
import com.company.main.service.User_Implement;

@RestController
@RequestMapping("/Items")
//@CrossOrigin(origins="http://localhost:4200/")
public class Items_Controller {
Items_Implement items;
User_Implement user;
Cart_Implement carts;
@Autowired
public Items_Controller(Items_Implement items,Cart_Implement cart,User_Implement user) {
	this.items = items;this.user=user;this.carts=cart;
}
@GetMapping("/ITEMS")
public List<Items_Entity> list(Model model) {
	List<Items_Entity> list= items.showAll();
model.addAttribute("items",list);
System.out.println(list.get(1).getF());
return list;
}
@PostMapping("/add")
public List<Items_Entity> add(@RequestBody AddItem_DTO item) {
return items.saves(item);	
}
@PostMapping("/search")
public List<Items_Entity> search(@RequestBody SearchItem_DTO item) {
return items.search(item);	
}
@PostMapping("/delete")
public List<Items_Entity> delete(@RequestBody AddItem_DTO item) {
return items.delete(item);	
}
@PostMapping("/update")
public List<Items_Entity> update(@RequestBody Update_DTO up) {
return items.upd(up);
}
}
