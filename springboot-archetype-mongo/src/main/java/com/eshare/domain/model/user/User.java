package com.eshare.domain.model.user;

import java.io.Serializable;

/**
 * Created by liangyh on 2018/8/19.
 * Email:10856214@163.com
 */
public class User implements Serializable {
    private static final long serialVersionUID = -1L;

    private String id;
    private String name;
    private Integer age;


    public User(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
