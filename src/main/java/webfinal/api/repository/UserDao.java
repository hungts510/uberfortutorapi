package webfinal.api.repository;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import webfinal.api.entity.Users;

@Mapper
@Repository
public interface UserDao {

    @Insert("INSERT INTO users(username, password, email, phone_number) VALUES (#{username}, #{password}, #{email}, #{phoneNumber})")
    @SelectKey(statement = " SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    Integer insertUser(Users newUser);

    @Select("SELECT * FROM users WHERE id = #{userId}")
    Users getUserById(@Param("userId") Integer userId);
}
