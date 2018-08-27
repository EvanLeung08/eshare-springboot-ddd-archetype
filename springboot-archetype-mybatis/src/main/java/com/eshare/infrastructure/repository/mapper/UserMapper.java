package com.eshare.infrastructure.repository.mapper;

import com.eshare.domain.model.user.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by liangyh on 2018/8/28.
 * Email:10856214@163.com
 */
public interface UserMapper {

    @Insert("INSERT INTO user(name,age,idcard) VALUES(#{name}, #{age},#{idcard},)")
    void insert(User user);

    @Select("SELECT * FROM user")
    List<User> getAll();

    @Select("SELECT * FROM user WHERE idcard= #{idcard}")
    User getOneByIdcard(String idcard);

    @Select("SELECT * FROM user WHERE id= #{id}")
    User getOneById(Long id);
}
