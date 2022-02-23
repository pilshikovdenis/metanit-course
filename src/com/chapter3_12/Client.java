package com.chapter3_12;

public class Client {
    private Bank bank;
    private String initials;
    private int age;


    Client(String initials,int age, Bank bank) {
        this.initials = initials;
        this.age = age;
        this.bank = bank;

    }

    public void showInfo() {
        System.out.println("Имя: " + initials);
        System.out.println("Банк: " + bank.getName());
        System.out.println();
    }

    public void showFullInfo() {
        System.out.println("Имя: " + initials);
        System.out.println("Возраст: " + age);
        System.out.println("Отчет по используемому банку");
        System.out.println("Наименование: " + bank.getName());
        System.out.println("Полное наимнование: " + bank.getFullName());
        System.out.println("Юр. адрес: " + bank.getLegalAddress());
        System.out.println();
    }

}
