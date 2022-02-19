package com.chapter3;

public class IncludedClasses {
    public static void main(String[] args) {
//        using included class
        Image wallpaper = new Image("wallpaper.jpg");
        wallpaper.position.showPosition();

//        using included class in all parts of context, not only classes
        Person tom = new Person("Tom");
        tom.setAccount("qwerty");


//        using static included class
        Math.Factorial fact = Math.getFactorial(6);
        System.out.printf("Факториал числа %d равен %d \n", fact.getKey(), fact.getResult());
    }
}

//included class
class Image {
    private String pathToFile;
    Position position;

    Image(String pathToFile) {
        this.pathToFile = pathToFile;
        position = new Position(50, 50);
    }

    class Position {
        private double x;
        private double y;

        Position(double x, double y) {
            this.x = x;
            this.y = y;
        }
        void showPosition() {
            System.out.println("x: " + x + " y: " + y);
        }
    }
}

//included class too
class Person{

    private String name;

    Person(String name){
        this.name = name;
    }

    public void setAccount (String password){

        class Account{

            void display(){
                System.out.printf("Account Login: %s \t Password: %s \n", name, password);
            }
        }
        Account account = new Account();
        account.display();
    }
}

// static included class
class Math{

    public static class Factorial{

        private int result;
        private int key;

        public Factorial(int number, int x){

            result=number;
            key = x;
        }

        public int getResult(){
            return result;
        }

        public int getKey(){
            return key;
        }
    }

    public static Factorial getFactorial(int x){

        int result=1;
        for (int i = 1; i <= x; i++){

            result *= i;
        }
        return new Factorial(result, x);
    }
}