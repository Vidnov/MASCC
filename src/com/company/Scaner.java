package com.company;

import javax.lang.model.element.Name;

public class Scaner extends Device{
    public  Scaner(String Name){
        super(Name);
    }
    public void Scan (){
        System.out.println("Идет сканирование...");
    }
}

