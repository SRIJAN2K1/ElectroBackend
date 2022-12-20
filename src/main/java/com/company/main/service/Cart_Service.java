package com.company.main.service;


import java.util.List;

import com.company.main.dto.AddCart_DTO;
import com.company.main.dto.Cart_DTO;
import com.company.main.dto.Pid_DTO;
import com.company.main.entity.Cart_Entity;

public interface Cart_Service {
	void save(Cart_Entity cart);
	List<Cart_Entity> delete(Pid_DTO car);
	List<Cart_Entity> addCart(AddCart_DTO add);
	List<Cart_Entity> display(Cart_DTO cart);
	public List<Cart_Entity> updateButton(AddCart_DTO ad);
}
