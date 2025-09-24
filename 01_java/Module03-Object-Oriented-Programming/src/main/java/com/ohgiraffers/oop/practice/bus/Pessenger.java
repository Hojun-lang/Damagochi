package com.ohgiraffers.oop.practice.bus;

public class Pessenger {
    private String name;
    private String sex;
    private int age;



    public Pessenger() {
    }


    public void setAge(int age){
        this.age = age;

    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(boolean sex){
        if (sex){
            this.sex = "Female";
        }else {
            this.sex =  "Male";
        }
    }


    public String getName() {
        return name;
    }
}
