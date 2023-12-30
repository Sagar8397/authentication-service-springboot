package org.sagar.services;

import org.sagar.dto.UserRequest;
import org.sagar.dto.UserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	public UserResponse addUserService(UserRequest request)
	{
		UserResponse response = new UserResponse();
		
		if(request.getUsername().equals("Admin") && request.getPassword().equalsIgnoreCase("Admin123") )
		{
			response.setStatus("Success");
			response.setMessage("User Added Successfully");
			response.setUsername(request.getUsername());
			response.setPassword(request.getPassword());
			response.setEmail(request.getEmail());
			response.setAge(request.getAge());
			response.setUserId(request.getUserid());
		}
		else
		{
			response.setStatus("Fail");
			response.setMessage("User Added Unsuccessfully");
		}
		
		return response;
	}
}
