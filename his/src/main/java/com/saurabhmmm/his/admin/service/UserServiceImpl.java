package com.saurabhmmm.his.admin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saurabhmmm.his.admin.bean.User;
import com.saurabhmmm.his.admin.entity.UserEntity;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	public boolean saveUser(User user)
	{
		UserEntity entity=new UserEntity();
		BeanUtils.copyProperties(user, entity);
		
		UserEntity savedentity=userRepo.save(entity);
		return savedentity.getUserid()!=null;
	}

	public List<User> viewAllUsers(){
	List<UserEntity> entities=userRepo.findAll();
	
	List<User> users=new ArrayList<User>();
	for (UserEntity entity:entities)
	{
		User user=new User();
		BeanUtils.copyProperties(entity,user);
		users.add(user);
	}
	return users;
	}

}
