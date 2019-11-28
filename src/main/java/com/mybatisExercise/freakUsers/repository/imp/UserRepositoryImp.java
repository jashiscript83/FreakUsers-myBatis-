package com.mybatisExercise.freakUsers.repository.imp;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mybatisExercise.freakUsers.domain.User;
import com.mybatisExercise.freakUsers.repository.UserRepository;


@Repository
public class UserRepositoryImp implements UserRepository{

	private static final Logger LOGGER = LoggerFactory.getLogger(UserRepositoryImp.class);
	
	@Autowired
	SqlSessionFactory sessionFactory;
	
	@Override
	public List<User> getAllUser() {
		SqlSession session = sessionFactory.openSession();
		List<User> result = Collections.emptyList();
		
		try {
			result = session.selectList("com.mybatisExercise.freakUsers.mapper.UserMapper/getAllUser");
		} catch (Exception e) {
			
			LOGGER.error(e.getMessage());
		}finally {
			
			
		}
		
		return result;
	}

}
