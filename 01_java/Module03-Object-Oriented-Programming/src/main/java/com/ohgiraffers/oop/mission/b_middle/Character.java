package com.ohgiraffers.oop.mission.b_middle;

public abstract class Character {
    public abstract String name();
    public abstract int hp();
    public void attack(){
        System.out.println("기본 공격!");
    }
}
