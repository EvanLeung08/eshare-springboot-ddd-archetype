package com.eshare.domain.model.user;

import java.io.Serializable;

/**
 * Created by liangyh on 2018/8/19.
 * Email:10856214@163.com
 */
public class User implements Serializable {
    private static final long serialVersionUID = -1L;

    private Long id;
    private String name;
    private Integer age;
    private String idcard;

    public User(Long id, String name, Integer age, String idcard) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.idcard = idcard;
    }

    public User(String name, Integer age, String idcard) {
        this.name = name;
        this.age = age;
        this.idcard = idcard;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", idcard='" + idcard + '\'' +
                '}';
    }
}
