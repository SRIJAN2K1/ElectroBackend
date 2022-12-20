package com.company.main.service;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.main.dto.AddCart_DTO;
import com.company.main.dto.Cart_DTO;
import com.company.main.dto.Pid_DTO;
import com.company.main.entity.Cart_Entity;
import com.company.main.entity.Items_Entity;
import com.company.main.persistence.CartDAODeclaration;
@Service
public class Cart_Implement implements Cart_Service{

	CartDAODeclaration cart;
	@Autowired
	public Cart_Implement(CartDAODeclaration cart) {
		this.cart = cart;
	}
	@Override
	@Transactional
	public void save(Cart_Entity users) {
		 cart.save(users);
	
	}
	@Override
	@Transactional
	public List<Cart_Entity> addCart(AddCart_DTO add) {
		Cart_Entity car=new Cart_Entity();
		List<Cart_Entity> list=cart.search2(add.getUid(), add.getProductid());
		if(list.size()!=0) {
//			Integer temp=list.get(0).getQty();temp++;
//			cart.update(temp,add.getProductid(),add.getUid());
			return null;
		}
		car.setN(add.getUid());
		car.setP(add.getProductid());
		car.setQty(add.getQty());
		cart.save(car);	
		System.out.println("Cart Called"+add.getUid());
		Cart_Implement c = new Cart_Implement(cart);
		Cart_DTO x = new Cart_DTO(add.getUid());
//		List<Cart_Entity> opj = c.display(x);
//		System.out.println(opj.get(list.size()-1).getItem()+" & so do me!");
		List<Cart_Entity> l = cart.search4(add.getUid());
//		System.out.println(l.get(list.size()-1).getItem()+" TBBT Rocks always!");
	return l;
	}
	@Override
	@Transactional
	public List<Cart_Entity> display(Cart_DTO carts) {
			List<Cart_Entity> list = cart.search(carts.getUid());
			System.out.println("Cart Called"+carts.getUid());
//			System.out.println(list.get(0).getP()+" Texas Rattle Snake")
		return list;
	}
	@Override
	@Transactional
	public List<Cart_Entity> delete(Pid_DTO carts) {
		System.out.println(carts.getProductid());
		List<Cart_Entity> list=cart.search3(carts.getProductid(),carts.getId());
		Integer x=list.get(0).getQty();
		x--;
		if(x!=0) {
		cart.update2(x,carts.getProductid() ,carts.getId());}
		else if(x==0) {
	cart.delete(carts.getProductid(),carts.getId());}
		Cart_Implement cat=new Cart_Implement(cart);
		Cart_DTO xyz=new Cart_DTO(carts.getUid());
		return cat.display(xyz);
	}
	@Override
	@Transactional
	public List<Cart_Entity> updateButton(AddCart_DTO ad){
		List<Cart_Entity> list=cart.search2(ad.getUid(), ad.getProductid());
		if(list.size()!=0) {
		    if(ad.getQty()>=1) {
		    System.out.println("Cart Called"+ad.getUid()+" pqr "+ad.getQty());
			cart.update(ad.getQty(), ad.getProductid(), ad.getUid());
			Cart_Implement x = new Cart_Implement(cart);
			Cart_DTO c = new Cart_DTO(ad.getUid());
			List<Cart_Entity> l1=x.display(c);
			List<Cart_Entity> l2=cart.search4(ad.getUid());
			System.out.println("Cart Called"+ad.getUid()+" mnm "+l2.get(0).getQty());
			System.out.println("Cart Called"+ad.getUid()+" abc "+l1.get(0).getQty());
			List<Cart_Entity> l = cart.search(ad.getUid());
			System.out.println("Cart Called"+ad.getUid()+" xyz "+l.get(0).getQty());
		return l;
		    }
		    else if(ad.getQty()<1) {
		    	cart.delete(ad.getProductid(),ad.getUid());
		    	System.out.println(ad.getQty()+ " Bazzinga Punk");
		    	List<Cart_Entity> l3=cart.search4(ad.getUid());
		    	return l3;
		    }
		}	
		
		return null;
	}
	
}
