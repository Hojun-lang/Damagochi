package com.ohgiraffers.oop.chap04.section01;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(super.name + "가 웁니다. 왈왈!");
    }
}
