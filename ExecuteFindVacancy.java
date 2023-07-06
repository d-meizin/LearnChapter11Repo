package com.chapter11;

import java.io.IOException;
class ExecuteFindVacancy {

    public static void main(String args[]) throws IOException {
        FindVacancy findAll = new FindVacancy();

        findAll.findRooms();
        findAll.showAll();
        findAll.showOneRow();
    }
}
