package com.ohgiraffers.oop.practice.bus;

public class Main {
    public static void main(String[] args) {
        Pessenger hojun = new Pessenger();
        Pessenger minyeong = new Pessenger();
        Pessenger jaeoong = new Pessenger();

        String name = hojun.getName();
        System.out.println("Hojun Name: " + name);
        hojun.setName("Hojun");
        hojun.setAge(25);
        hojun.setSex(true);

        minyeong.setName("Minyeong");
        minyeong.setAge(30);
        minyeong.setSex(false);

        jaeoong.setName("Jaeoong");
        jaeoong.setAge(35);
        jaeoong.setSex(true);

        hojun.getName();
        String name1 = hojun.getName();
        System.out.println("Hojun Name: " + name1);

        minyeong.getName();
        String name2 = minyeong.getName();
        System.out.println("Minyeong Name: " + name2);


        Bus bus = new Bus();


        bus.pessenger = jaeoong;

        bus.driver = "남궁성";
        bus.seats = 4;

        System.out.println(bus.goBus());
        System.out.println(bus.print());
        System.out.println(bus.stopBus());
    }
}
