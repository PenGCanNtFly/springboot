package com.hanzo.springboot.adminlte.velocity.model;

/**
 * Created by P10103052 on 2017/4/13.
 */
public class UserEntity {
    /**
     * id
     */
    private int id;

    /**
     * name
     */
    private String name;

    /**
     * age
     */
    private int age;

    public int getId() {
        return id;
    }
    public void setId(int id) {
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
