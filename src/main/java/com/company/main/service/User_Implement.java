package com.company.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;

import com.company.main.dto.User_DTO;
import com.company.main.entity.User_Entity;
import com.company.main.persistence.UserDAODeclaration;
@Service
public class User_Implement implements User_Service {
	UserDAODeclaration user;
	@Autowired
	public User_Implement(UserDAODeclaration user) {
		this.user = user;
	}
	public User_Implement() {
		
	}
	@Override
	@Transactional
	public User_Entity save(User_DTO users) {
		User_Entity u = new User_Entity();
		List<User_Entity> ux= user.search(users.getName(),users.getPwd());
		if(ux.size()!=0) {
			return null;
		}
		u.setE(users.getEmail());
		u.setN(users.getName());
		u.setP(users.getPwd());
		 user.save(u);
		 List<User_Entity> x= user.search(users.getName(),users.getPwd());
		 System.out.println(x.get(0).getN() + "Big Bang");
		return x.get(0); 
	}
	@Override
	@Transactional
	public User_Entity getUid(User_DTO users) {
		
		List<User_Entity> u= user.search(users.getName(),users.getPwd());
		if(u.isEmpty()) {
			return null;
//			User_Entity u2 = new User_Entity();
//			u2.setE(users.getEmail());
//			u2.setN(users.getName());
//			u2.setP(users.getPwd());
//			user.save(u2);User_Implement use=new User_Implement(user);
//			System.out.println(use.getUid(users).getI());
//			return use.getUid(users); 
		}
		System.out.println(u.get(0).getI());
		return u.get(0);
		
	}
}
