package com.Learning.Mybatis.SpringMybatisExample;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

@Mapper 
public interface UserMapper {

	@Select("select * from Student_Details")
	List<Users> findAll();
	
	@Insert("insert into Student_Details(Student_ID,Student_Name,Contact) values(#{Student_ID},#{Student_Name},#{Contact})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
            before = false, resultType = Integer.class)
    void insert(Users users);
	
	@Delete("delete from Student_Details where Student_ID = #{Student_ID}")
	void delete(Users users);
	
	@Update("update Student_Details set Student_Name=#{Student_Name},Contact=#{Contact} where Student_ID=#{Student_ID} ")
	void update(Users users);
}
