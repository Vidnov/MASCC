package com.company;

public class Printer extends Device{
    public  Printer(String Name){
        super(Name);
    }
    public void Print (){
        System.out.println("Идет печать струйным методом ...");
    }
}
