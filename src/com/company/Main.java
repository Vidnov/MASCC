package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//      Personal HR = new Personal("Ivanov","Ivan", "Ivanovich");
//      HR.sayHello();

      Scaner HP = new Scaner("HP");
      HP.powerON();
      HP.Scan();
      HP.powerOFF();

      Office MainOffice= new Office();
      MainOffice.addRoom(1);
      MainOffice.addRoom(2);
      MainOffice.addRoom(53);
      MainOffice.viewRooms();

      MainOffice.rooms.get(1).addPerson("Vidnov","Nikita","Alekseevich");
      MainOffice.rooms.get(1).addPerson("test","test","test");

      MainOffice.rooms.get(1).viewPerson();
      MainOffice.rooms.get(0).viewPerson();

      MainOffice.rooms.get(1).addDevice("Printer","Canon MF3010");
      MainOffice.rooms.get(0).addDevice("MFU","HP 1536");
      MainOffice.rooms.get(1).addDevice("Printer","Canon MF3010"); //Выдаст ошибку
      System.out.println("-------------------------------------------------");
      MainOffice.viewsAll();
      System.out.println("-------------------------------------------------");
      MainOffice.allPeople();
    }
}
