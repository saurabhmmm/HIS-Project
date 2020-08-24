package com.saurabhmmm.his.admin.service;

import java.util.List;

import com.saurabhmmm.his.admin.bean.User;

public interface UserService {
public boolean saveUser(User user);

public List<User> viewAllUsers();

}
