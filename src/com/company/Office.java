package com.company;

import java.util.ArrayList;

public class Office {

    ArrayList <Room> rooms = new ArrayList <Room>();
    ArrayList <Personal> peoples = new ArrayList<Personal>();

    int Choise = 0;
    public void addRoom (int Number){

          rooms.add(new Room(Number));

          System.out.println("Добавлен новый кабинет №"+Number);
          Choise=Choise+1;
    }
    public void viewRooms() {

        for (int i = 0; i < rooms.size(); i++) {
            System.out.println("Список кабинетов в нашем офисе " + rooms.get(i).Number);
        }
    }
    public void allPeople(){
        for (int i = 0; i < rooms.size(); i++){
            if (rooms.get(i).personals.size()>0){
                for( int t = 0; t< rooms.get(i).personals.size();t++){
                    peoples.add(new Personal(
                            rooms.get(i).personals.get(t).FirstName,
                            rooms.get(i).personals.get(t).LastName,
                            rooms.get(i).personals.get(t).SecondName,
                            rooms.get(i).Number)
                    );
                }
            }
        }
        for(int i = 0; i < peoples.size(); i++){
            System.out.println(peoples.get(i).FullName+" "+peoples.get(i).Room);
        }

    }
    public void viewsAll(){

        for (int i = 0; i < rooms.size(); i++) {
            System.out.println("В кабинете номер" + rooms.get(i).Number);
            if (rooms.get(i).personals.size()==0){
                System.out.println("В кабинете номер "+rooms.get(i).Number+" пока никто не работает");
            }
            for( int t = 0; t< rooms.get(i).personals.size();t++){
                System.out.println("Работают " + rooms.get(i).personals.get(t).FullName);
            }
            if(rooms.get(i).scaners.size()>0){
                for( int t = 0; t< rooms.get(i).scaners.size();t++){
                    System.out.println("Привязан " + rooms.get(i).scaners.get(t).Name);
                }
            }else if(rooms.get(i).printers.size()>0) {
                for( int t = 0; t< rooms.get(i).printers.size();t++){
                    System.out.println("Привязан " + rooms.get(i).printers.get(t).Name);
                }
            }
            else if(rooms.get(i).mfus.size()>0){
                for( int t = 0; t< rooms.get(i).mfus.size();t++){
                    System.out.println("Привязан " + rooms.get(i).mfus.get(t).Name);
                }
            }else {
                System.out.println("Не привязано ни одно оборудование");
            }

        }
    }

}