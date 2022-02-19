package com.chapter3;

public class ObjectsLikeParameters {
    public static void main(String[] args) {
        Phone workPhone = new Phone("49213904214");
        changeNumber(workPhone, "2414124125");
        System.out.println(workPhone.getNumber());

        Phone homePhone = new Phone("999999999");
        changeNumber2(homePhone, "3333333333333");
        System.out.println(homePhone.getNumber());

    }

    static void changeNumber (Phone phone, String newNumber) {
        phone.setNumber(newNumber);
    }

    static void changeNumber2(Phone phone, String newNumber) {
        phone = new Phone(phone.getNumber());
        phone.setNumber("8800213213");

    }
}

class Phone {
    private String number;

    Phone(String number) {
        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}