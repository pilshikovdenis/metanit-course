package com.chapter2;

public class IfCondition {
    public static void main(String[] args) {

         int a = 4;
         if (a < 14) {
             System.out.println("a < 14");
         }
         else  {
             System.out.println("a > 14");
         }

         String name = "Morris";
         if (name.equals("gaizenberg")) {
             System.out.println("you can go out");
         }



         int x = 15;
         int y = 200;
         int z = 30;
         if (x >= y && x >= z) {
             System.out.println(x);
         }
         else if (y >= x && y >= z) {
             System.out.println(y);
         }
         else
             System.out.println(z);


        //    switch
        String color = "black";
        switch(color) {
            case "green":
                System.out.println(1);
                break;
            case "yellow":
                System.out.println(2);
                break;
            case "purple":
                System.out.println(3);
                break;
            case "black":
                System.out.println(4);
                break;
            default:
                System.out.println(0);
        }
    }



}
