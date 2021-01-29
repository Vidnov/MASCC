package com.company;

public class Device {

    public String Name;
    public Boolean Power;
    public Device (String Name){
        this.Name=Name;

    }
    public void powerON(){
        this.Power = true;
        System.out.println(this.Name+" Включен");
    }
    public void powerOFF(){
        this.Power = false;
        System.out.println(this.Name+" Выключен");
    }

}

