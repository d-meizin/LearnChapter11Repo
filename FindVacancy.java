package com.chapter11;

import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
class FindVacancy extends ShowGuest2 {
        void findRooms() throws IOException {
            Scanner keyboard = new Scanner(System.in);
            Scanner diskScanner = new Scanner(new File("GuestsInRoom.txt"));

            for (roomNum = 0; roomNum < 12; roomNum++) {
                guests[roomNum] = diskScanner.nextInt();
            }

            roomNum = 0;
            while (roomNum < 12 && guests[roomNum] != 0) {
                roomNum++;
            }

            if (roomNum == 12) {
                out.println("Извините, свободных комнат нет.");
            } else {
                out.print("Сколько человек поселятся в комнате ");
                out.print(roomNum);
                out.print("?");
                guests[roomNum] = keyboard.nextInt();

                PrintStream listOut = new PrintStream("GuestsInRoom.txt");
                for (roomNum = 0; roomNum < 12; roomNum++) {
                    listOut.print(guests[roomNum]);
                    listOut.print(" ");
                }
            }
        }
}


