package com.company.main.service;

import java.util.List;

import com.company.main.dto.AddItem_DTO;
import com.company.main.dto.SearchItem_DTO;
import com.company.main.dto.Update_DTO;
import com.company.main.entity.Items_Entity;

public interface Items_Service {
	public List<Items_Entity> showAll();
	public List<Items_Entity> saves(AddItem_DTO add);
	public List<Items_Entity> search(SearchItem_DTO search);
	List<Items_Entity> delete(AddItem_DTO add);
	List<Items_Entity> upd(Update_DTO upd);
}
