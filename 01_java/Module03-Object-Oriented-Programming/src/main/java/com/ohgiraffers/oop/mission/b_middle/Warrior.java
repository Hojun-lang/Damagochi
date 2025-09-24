package com.ohgiraffers.oop.mission.b_middle;

public class Warrior extends Character {

    @Override
    public String name() {
        return "전사";
    }

    @Override
    public int hp() {
        return 100;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("강력한 칼로 공격!!");
    }
}
