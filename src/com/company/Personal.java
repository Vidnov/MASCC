package com.company;

public class Personal {
    public String FirstName;
    public String LastName;
    public String SecondName;
    public String FullName ;
    public Number Room;

    public Personal(String FirstName,String LastName,String SecondName,Number Room){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.SecondName=SecondName;
        this.Room = Room;
        this.FullName = this.FirstName+" "+this.LastName+" "+this.SecondName;
    }

    public void sayHello(){
        System.out.println("Hello, my name is: "+this.FullName);
    }


}
