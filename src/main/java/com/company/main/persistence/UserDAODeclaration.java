package com.company.main.persistence;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.company.main.entity.User_Entity;
@Repository
public interface UserDAODeclaration extends JpaRepository<User_Entity,Integer> {
	
	@Query("from user where name=?1 and pwd=?2")
	List<User_Entity> search(String name, String pwd);
}
