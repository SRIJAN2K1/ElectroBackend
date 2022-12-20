package com.company.main.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.company.main.entity.Cart_Entity;
import com.company.main.entity.User_Entity;

public interface CartDAODeclaration extends JpaRepository<Cart_Entity,Integer> {
	@Query("from cart where userid=?1")
	List<Cart_Entity> search(int i);
	@Modifying(clearAutomatically=true)
	@Query("delete from cart where productid=?1 and userid=?2")
	void delete(Integer i,Integer e);
	
	@Modifying(clearAutomatically=true)
	@Query("update cart set qty=?1 where productid=?2 and userid=?3")
	void update(Integer i,Integer e,Integer f);
	
	@Modifying(clearAutomatically=true)
	@Query("update cart set qty=?1 where productid=?2 and id=?3")
	void update2(Integer i,Integer e,Integer f);
	
	@Query("from cart where userid=?1 and productid=?2")
	List<Cart_Entity> search2(Integer i,Integer j);
	
	@Query("from cart where productid=?1 and id=?2")
	List<Cart_Entity> search3(Integer i,Integer j);
	
	@Query("from cart where userid=?1")
	List<Cart_Entity> search4(Integer i);
}
