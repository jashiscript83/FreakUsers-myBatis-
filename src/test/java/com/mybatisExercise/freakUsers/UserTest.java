package com.mybatisExercise.freakUsers;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mybatisExercise.freakUsers.domain.User;
import com.mybatisExercise.freakUsers.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
	
	@Autowired
	UserRepository  userRepository;
	@Test
	public void testGetAllUser() {
		
		List<User> result = userRepository.getAllUser();
		
		result.forEach(e->{
			
			
			System.err.println(e);
		});
		
	}

}
