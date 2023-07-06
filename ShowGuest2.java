package com.chapter11;

import static java.lang.System.out;
class ShowGuest2 {
    int guests[] = new int[12];
    int roomNum;
    void showAll() {
        out.println("Всего комнат: " + guests.length);
        out.println("Комната\tКоличество");

        for(int roomNumb = 0; roomNumb < 12; roomNumb++) {
            out.print(roomNumb);
            out.print("\t\t");
            out.println(guests[roomNumb]);
        }
    }

    void showOneRow() {
            out.println("А теперь кол-во гостей одной строкой:");
            for (int numbOfGuests : guests) {
                out.print(numbOfGuests + " ");
            }
    }
}
