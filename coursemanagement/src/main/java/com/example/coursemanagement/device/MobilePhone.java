package com.example.coursemanagement.device;

public class MobilePhone {
    private final Battery battery;
    public MobilePhone(Battery battery){
        this.battery = battery;
    }
    public String turnOn(){
        return  battery.supplyPower() + "-> Mobile phone turned on";
    }
}
