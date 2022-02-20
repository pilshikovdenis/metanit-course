package com.chapter3_2;

public class Interfaces {
    public static void main(String[] args) {
        Book book1 = new Book("Гарри Поттер", "Джоан Роулинг");
        book1.print();

        Journal journal = new Journal("Mens style");
        journal.print();


//        can use interface like type
        Printable book2 = new Book("Чистый код", "Роберт Мартин");
        book2.print();

        Printable journal2 = new Journal("Wall Street Journal");
        journal2.print();
        System.out.println();


//        interfaces in type conversion
        Printable journal3 = new Journal("Men's look");
//        System.out.println(journal3.name); is not working, need conversion
        String name = ((Journal)journal3).getName();
        System.out.println(name);
        System.out.println();


//        using default methods in interfaces
        Journal j1 = new Journal("BURDA");
        j1.print();


//        using static inteface methods
        Printable.printSomeInfo();
        System.out.println();


//        using private methods in interfaces
        Calculation c = new Calculation();
        System.out.println(c.sum(12, 44));
        System.out.println(c.sum(12, 22, 33));
    }
}





