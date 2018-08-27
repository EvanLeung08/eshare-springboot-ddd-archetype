package com.eshare.infrastructure.repository.mapper;

import com.eshare.domain.model.user.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by liangyh on 2018/8/28.
 * Email:10856214@163.com
 */
public interface AnnotationUserMapper {

    @Insert("INSERT INTO user(name,age,idcard) VALUES(#{name}, #{age},#{idcard},)")
    void insert(User user);

    @Select("SELECT * FROM user")
    List<User> getAll();

    @Select("SELECT * FROM user WHERE idcard= #{idcard} limit 1")
    User getOneByIdcard(String idcard);

    @Select("SELECT * FROM user WHERE id= #{id}")
    User getOneById(Long id);

    @Select("SELECT * FROM user WHERE name= #{name} limit 1")
    User getOneByName(String name);

    @Update("UPDATE user SET name=#{name},age=#{age},idcard=#{idcard} WHERE id=#{id}")
    void modifyUser(User user);

    @Delete("DELETE FROM user WHERE idcard=#{idcard}")
    void deleteUser(String idcard);
}
