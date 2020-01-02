package com.Learning.Mybatis.SpringMybatisExample;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

	private UserMapper userMapper;
	
	public UserResource(UserMapper userMapper)
	{
		this.userMapper=userMapper;
	}
	
	@GetMapping("/all")
	public List<Users> getAll()
	{
		return userMapper.findAll();
	}
	
	 @GetMapping("/update")
	    private List<Users> insert() {

	        Users users = new Users();
	        users.setId(105);
	        users.setName("Shaun");
	        users.setContact("09788");

	        userMapper.insert(users);

	        return userMapper.findAll();
	        
}
	 @GetMapping("/deleteid")
	   private List<Users> delete()
	   {
		 Users users = new Users();
	        users.setId(105);
		   userMapper.delete(users);
		   return userMapper.findAll();
	   }
	 @GetMapping("/updatedata")
	   private List<Users> update()
	   {
		 Users users = new Users();
	        users.setId(105);
	        users.setName("Jamie");
	        users.setContact("9334");

	        userMapper.update(users);

	        return userMapper.findAll();
	        
	   }
	 
}
