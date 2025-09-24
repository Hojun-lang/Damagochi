package com.ogiraffers.chap01.section03.model;

public class FixedDevice extends Device {

    public FixedDevice(String model) {
        super(model);
    }

    @Override
    public void powerOn() {
        System.out.println("Power on 고정형" + super.getModel());
    }

    @Override
    public void powerOff() {
        System.out.println("Power off 고정형" + super.getModel());
    }
}
