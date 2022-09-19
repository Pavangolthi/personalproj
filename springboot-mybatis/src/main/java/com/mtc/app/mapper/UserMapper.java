package com.mtc.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.mtc.app.model.User;

@Mapper
public interface UserMapper {
	
	@Select("select * from user")
	List<User> getUsers();
	
	@SelectKey(statement= "SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
	@Insert("insert into user(name, username) values(#{name},#{username})")
	void update(User user);

}
