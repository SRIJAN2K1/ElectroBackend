package com.company.main.service;



import com.company.main.dto.User_DTO;
import com.company.main.entity.User_Entity;
public interface User_Service {
public User_Entity save(User_DTO user);
User_Entity getUid(User_DTO user);
}
