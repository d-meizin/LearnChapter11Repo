package com.chapter11;

import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
class ShowRooms {

    public static void main(String args[]) throws IOException {
    //    Room rooms[];
    //    rooms = new Room[7];
        /* Дальше специально попробую другой способ инициализации
           чтобы посмотреть как это работает
         */
        Room rooms[] = {new Room(), new Room(), new Room(), new Room(), new Room(), new Room(), new Room()};

        Scanner diskScanner = new Scanner(new File("RoomList.txt"));

        for (int roomNum = 0; roomNum < 7; roomNum++) {
         //   rooms[roomNum] = new Room();
            rooms[roomNum].readRoom(diskScanner);
        }

        out.println("Комната\tКолич.\tТариф\t\t" + "Для курящих");
        for (int roomNum = 0; roomNum < 7; roomNum++) {
            out.print(roomNum);
            out.print("\t\t");
            rooms[roomNum].writeRoom();
        }
    }
}
