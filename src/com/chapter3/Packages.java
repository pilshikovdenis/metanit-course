package com.chapter3;


import com.pilshikov.Human;
import static com.pilshikov.Util.*;
public class Packages {



    public static void main(String[] args) {
        Human hero = new Human("Morris");
        hero.showInfo();

        com.mysql.Database mysqlDb = new com.mysql.Database();
        com.oracledb.Database oracleDb = new com.oracledb.Database();

//        static import
        String[] names = {"Morris", "Jojo", "Kenzo"};
        int[] days = {1, 2, 4};
        printArray(names);
        printArray(days);
    }
}
