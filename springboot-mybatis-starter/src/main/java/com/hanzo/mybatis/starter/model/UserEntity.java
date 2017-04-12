package com.hanzo.mybatis.starter.model;

/**
 * Created by P10103052 on 2017/4/12.
 */
public class UserEntity {
    /**
    * 编号
     */
    private Long id;

    /**
    * 名称
     */
    private String name;

    /**
    * 年龄
     */
    private int age;

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

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
