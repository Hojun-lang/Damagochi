package com.ohgiraffers.oop.mission.b_middle;

public class Wizard extends Character {
    @Override
    public String name() {
        return "";
    }

    @Override
    public int hp() {
        return 0;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("화려한 마법으로 공격!");
    }
}
