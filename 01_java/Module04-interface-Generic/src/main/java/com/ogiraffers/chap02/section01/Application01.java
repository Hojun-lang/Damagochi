package com.ogiraffers.chap02.section01;

public class Application01 {
    public static void main(String[] args) {
        ObjectBox stringBox = new ObjectBox();
        stringBox.setItem("Hello");

        String box = (String) stringBox.getItem();

        System.out.println(box);
    }
}
