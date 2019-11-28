package com.mybatisExercise.freakUsers.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.mybatisExercise.freakUsers.domain.User;


@Mapper
public interface UserMapper {

	
	@Select("select * from dario.users")
	List<User>findAll();
	
	@Insert("insert into users(name, age, product) values(#{name},#{age},#{product})")
	@SelectKey(statement = "SELECT LAST_INSERT_ID()",keyProperty = "id",
	            before = false, resultType = Integer.class)
	void insert(User users);
	
	@Update("update users set product=#{product} where name=#{name}")
	void update(User users);
	
	@Delete("delete from users where name=#{name}")
	void delete(User  users);
	
	
	
	
}
