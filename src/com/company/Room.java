package com.company;
import java.util.ArrayList;

public class Room {
    int Number;
    int Choise=0;

    ArrayList <Personal> personals = new ArrayList <Personal>();
    ArrayList <Scaner> scaners = new ArrayList <Scaner>();
    ArrayList <Printer> printers = new ArrayList <Printer>();
    ArrayList <MFU> mfus = new ArrayList <MFU>();


    public Room(int Number){
        this.Number = Number;
    }

    public void addPerson(String FirstName, String LastName, String SecondName){
        personals.add(new Personal(FirstName,LastName,SecondName,this.Number));
        System.out.println("В Кабинет №"+this.Number+" Добавлен новый сотрудник:"+FirstName+" "+LastName+" "+SecondName);
        Choise=Choise+1;
    }
    public void viewPerson(){
        for (int i = 0; i < personals.size(); i++){
            System.out.println("Список сотрудников в нашем кабинете "+personals.get(i).FullName);
        }
    }

    public void addDevice(String Type,String Name){

        if (Type=="Scaner" & scaners.size()==0){
            scaners.add(new Scaner(Name));
            System.out.println("В кабинет номер "+this.Number+"добавлен Сканер");
        }else if (Type=="Printer" & printers.size()==0){
            printers.add(new Printer(Name));
            System.out.println("В кабинет номер "+this.Number+"добавлен Принтер");
        }else if (Type=="MFU" & mfus.size()==0){
            mfus.add(new MFU(Name));
            System.out.println("В кабинет номер "+this.Number+"добавлена МФУ");
        }else{
            System.out.println("К кабинету уже привязано устройство");
        }
    }


}
