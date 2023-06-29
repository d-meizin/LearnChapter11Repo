package com.chapter11;

import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class ShowGuests {

    public static void main(String args[]) throws IOException {
        int guests[] = new int[12];
        Scanner diskScanner = new Scanner(new File("GuestsInRoom.txt"));

        for(int roomNumb = 0; roomNumb < 12; roomNumb++) {
            guests[roomNumb] = diskScanner.nextInt();
        }
        out.println("Всего комнат: " + guests.length);
        out.println();
        out.println("Комната\tКоличество");

        for(int roomNumb = 0; roomNumb < 12; roomNumb++) {
            out.print(roomNumb);
            out.print("\t\t");
            out.println(guests[roomNumb]);
        }

        out.println("А теперь кол-во гостей одной строкой:");
        for(int numbOfGuests : guests) {
            out.print(numbOfGuests + " ");
        }

    }
}
