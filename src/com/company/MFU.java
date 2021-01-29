package com.company;

public class MFU extends Device{

    public MFU(String Name) {
        super(Name);
    }

    public void Print (){
            System.out.println("Идет печать лазерным методом ...");
        }
        public void Scan (){
            System.out.println("Идет сканирование...");
        }
        public void Copy (){
        System.out.println("Идет Копирование...");
        }
    }
