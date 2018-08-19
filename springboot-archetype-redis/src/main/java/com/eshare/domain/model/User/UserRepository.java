package com.eshare.domain.model.User;

/**
 * User的仓存接口
 * Created by liangyh on 2018/8/19.
 * Email:10856214@163.com
 */
public interface UserRepository  {

    User findByName(String name);
}
