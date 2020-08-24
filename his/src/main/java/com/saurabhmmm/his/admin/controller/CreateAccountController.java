package com.saurabhmmm.his.admin.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.saurabhmmm.his.admin.bean.User;
import com.saurabhmmm.his.admin.service.UserService;

@Controller
public class CreateAccountController {
	 @Autowired
	  public UserService userService;
	 
	 @GetMapping(value="/")
	  public String loadForm(Model model) {
	   User user=new User();
	   model.addAttribute("contact",user);
	    return "userInfo";
	  }
	 @PostMapping(value = "/saveUser")
	 public String addUser(@ModelAttribute("user") User user,Model model) {
	 boolean isSaved=userService.saveUser(user);
	 if(isSaved) {
		 model.addAttribute("succMsg","Account Created");
	 }
	 else {
		 model.addAttribute("errMsg","Account Creation Failed");
			 
	 }
	 return "userInfo"; 
	}
	 
	 @GetMapping("/viewUsers")
	 public String ViewUsers(Model model)
	 {
		 List<User> users=userService.viewAllUsers();
		 model.addAttribute("users", users);
		 return "viewUsers";
	 }
	}
