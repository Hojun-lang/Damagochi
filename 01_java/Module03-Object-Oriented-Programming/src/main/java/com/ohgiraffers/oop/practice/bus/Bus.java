package com.ohgiraffers.oop.practice.bus;

public class Bus {
    public Pessenger pessenger;
    public String driver;
    public int seats;

    public String goBus(){
        return "출발합니다";
    }
    public String stopBus(){
        return "도착했습니다";
    }
    public String print(){
        return "버스를 운행하는 " + driver + " 입니다. 잘 부탁드립니다 " + pessenger.getName() + " 님.";
    }

}
