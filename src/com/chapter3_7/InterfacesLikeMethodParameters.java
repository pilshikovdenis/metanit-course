package com.chapter3_7;

public class InterfacesLikeMethodParameters {
    public static void main(String[] args) {
        System.out.println("test");

        Printable printable = createPrintable("Алиса в стране чудес", true);
        printable.print();

        read(new Book("Сказка о царе Салтане", "А.С.Пушкин"));
        read(new Journal("Men's health"));

    }

    static void read(Printable p) {
        p.print();
    }

    static Printable createPrintable(String name, boolean option) {
        if (option) {
            return new Book(name, "Undefined");
        }
        else {
            return new Journal(name);
        }
    }
}

