package com.company.main.persistence;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.company.main.entity.Items_Entity;
public interface ItemsDAODeclaration extends JpaRepository<Items_Entity,Integer> {
	@Query("from items_1 where items=?1 ")
	List<Items_Entity> search(String name);
	@Modifying(clearAutomatically=true)
	@Query("delete from items_1 where items=?1 ")
	void delete(String name);
	@Modifying(clearAutomatically=true)
	@Query("update items_1 SET items=?1,funct=?2,specs=?3,price=?4 where id=?5")
	void upd(String items,String fun,String specs,Integer price,Integer id);
}
