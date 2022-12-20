package com.company.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.main.dto.AddItem_DTO;
import com.company.main.dto.SearchItem_DTO;
import com.company.main.dto.Update_DTO;
import com.company.main.dto.User_DTO;
import com.company.main.entity.Items_Entity;
import com.company.main.entity.User_Entity;
import com.company.main.persistence.ItemsDAODeclaration;
@Service
public class Items_Implement implements Items_Service {

	ItemsDAODeclaration item;
	@Autowired
	public Items_Implement(ItemsDAODeclaration item) {
		this.item = item;
	}
	
	@Override
	@Transactional
	public List<Items_Entity> showAll() {
		// TODO Auto-generated method stub
		return item.findAll();
	}
	@Override
	@Transactional
	public List<Items_Entity> saves(AddItem_DTO add) {
		Items_Entity i = new Items_Entity();System.out.println(add.getFun()+" "+add.getSpecs());
		 i.setF(add.getFun());
		 i.setN(add.getItems());
		 i.setS(add.getSpecs());
		 i.setPrice(add.getPrice());
		 item.save(i);
			Items_Implement imp=new Items_Implement(item);
			return imp.showAll();
	}

	@Override
	@Transactional
	public List<Items_Entity> search(SearchItem_DTO search) {
		List<Items_Entity> list =item.search(search.getName());
		return list;
	}

	@Override
	@Transactional
	public List<Items_Entity> delete(AddItem_DTO add) {
		Items_Implement imp=new Items_Implement(item);System.out.println(add.getItems());
		item.delete(add.getItems());	
		return imp.showAll();
	}

	@Override
	@Transactional
	public List<Items_Entity> upd(Update_DTO upd) {System.out.println(upd.getId());
		item.upd(upd.getItems(),upd.getFunct(),upd.getSpecs(),upd.getPrice(),upd.getId());
		Items_Implement imp=new Items_Implement(item);
		return imp.showAll();
	}	

}
