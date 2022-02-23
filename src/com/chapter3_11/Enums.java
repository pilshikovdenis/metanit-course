package com.chapter3_11;

public class Enums {
//    enums methods
    public static void main(String[] args) {

        Genre[] gameGenres = Genre.values();
        for (Genre genre : gameGenres) {
            System.out.println(genre);
        }
        System.out.println();

        System.out.println(Genre.CLICKER.ordinal());
        System.out.println(Genre.SHOOTER.ordinal());

    }
}

enum Genre {
    ACTION,
    RPG,
    SHOOTER,
    CLICKER
}