package org.sagar.controller;

import org.sagar.dto.UserRequest;
import org.sagar.dto.UserResponse;
import org.sagar.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUserController {

	@Autowired
	UserService service;
	
	@PostMapping(path = "/auth/add-user" , consumes = {"application/json" , "application/xml"} , 
			produces = {"application/json" , "application/xml"})
	public UserResponse addUser(@RequestBody UserRequest userRequest)
	{
		return service.addUserService(userRequest);
	}
}
