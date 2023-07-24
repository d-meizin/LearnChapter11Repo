package com.chapter11;

import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
class ShowNames {
    public static void main(String args[]) throws IOException {
        ArrayList<String > people = new ArrayList<>();
        Scanner diskScanner = new Scanner(new File("names.txt"));

        while (diskScanner.hasNext()) {
            people.add(diskScanner.nextLine());
        }

        people.remove(7);
        people.remove(6);
        people.remove(5);
        people.add(2, "Ольга Сергеевна");

        for (String name : people) {
            out.println(name);
        }
    }

}
