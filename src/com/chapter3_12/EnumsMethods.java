package com.chapter3_12;

public class EnumsMethods {
    public static void main(String[] args) {
//        create users
        Client client = new Client("Morris Wickman", 22, Bank.ALFABANK);
        Client client2 = new Client("Olga Aizo", 33, Bank.SBERBANK);
        Client client3 = new Client("Denis Gottis", 22, Bank.TINKOFF);

//        show info
        client.showInfo();
        client.showFullInfo();

        client2.showInfo();
        client2.showFullInfo();

        client3.showInfo();
        client3.showFullInfo();

    }
}

