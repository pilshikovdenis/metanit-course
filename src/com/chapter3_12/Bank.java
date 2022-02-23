package com.chapter3_12;

public enum Bank {

    SBERBANK("ПАО Сбербанк", "Публичное акционерное общество «Сбербанк России»",
            "Россия, Москва, 117312, ул. Вавилова, д. 19"),
    TINKOFF("АО «Тинькофф Банк»", "Акционерное общество «Тинькофф Банк»",
            "Москва, 127287, ул. Хуторская 2-я, д. 38А, стр. 26"),
    ALFABANK("АО «АЛЬФА-БАНК»","АКЦИОНЕРНОЕ ОБЩЕСТВО «АЛЬФА-БАНК»",
            "107078, г. Москва, ул. Каланчевская, д. 27");


    private String name;
    private String fullName;
    private String legalAddress;

    Bank(String name, String fullName, String legalAddress) {
        this.name = name;
        this.fullName = fullName;
        this.legalAddress = legalAddress;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLegalAddress() {
        return legalAddress;
    }

    public String toString() {
        return "Сокращенное наименование: " + name +
                "\nПолное наименование: " + fullName +
                "\nЮридический адрес: " + legalAddress;
    }
}
