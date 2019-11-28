package com.mybatisExercise.freakUsers.cotroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybatisExercise.freakUsers.domain.User;
import com.mybatisExercise.freakUsers.mapper.UserMapper;


@RestController
@RequestMapping("/users")
public class UserController {

	
	private UserMapper userMapper;
	
	public UserController(UserMapper userMapper) {
		
		this.userMapper = userMapper;
		
	}
	
	
	@GetMapping("/all")
	public List<User> getAll(){
		
		
		List<User> users = userMapper.findAll();
		
		
	    
		return userMapper.findAll();		
		
	}
	
	@GetMapping("/updateUsers")
	public List<User> updateUsers(){
		
		
		User users = new User();
		users.setName("Daredevil");
		users.setAge(32);
		users.setProduct("Netflix");
		
		userMapper.update(users);


		return userMapper.findAll();		
		
	}
	
	@GetMapping("/update")
	public List<User> update(){
		
		
		User users = new User();
		users.setName("Daredevil");
		users.setProduct("Netflix");
		
		userMapper.insert(users);


		return userMapper.findAll();		
		
	}
	
	@GetMapping("/delete")
	public List<User> delete(){
		
		
		User users = new User();
		users.setName("Daredevil");
		
		
		
		userMapper.delete(users);


		return userMapper.findAll();		
		
	}
	
	
	
	
	
	
}
