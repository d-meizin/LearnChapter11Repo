package com.chapter11;

import static java.lang.System.out;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
public class Room {
    private int guests;
    private double rate;
    private boolean smoking;
    private static NumberFormat currency =
            NumberFormat.getCurrencyInstance(Locale.US);

    public void readRoom(Scanner diskScanner) {
        guests = diskScanner.nextInt();
        rate = diskScanner.nextDouble();
        smoking = diskScanner.nextBoolean();
    }

    public void writeRoom() {
        out.print(guests);
        out.print("\t\t");
        out.print(currency.format(rate));
        out.print("\t\t");
        out.println(smoking ? "да" : "нет");
    }
}
