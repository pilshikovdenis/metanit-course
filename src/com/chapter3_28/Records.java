package com.chapter3_28;

public class Records {
    public static void main(String[] args) {

        Person p1 = new Person("Morris", 12);
        Person p2 = new Person("GucciMane", 32);

        System.out.println(p1.age());
        System.out.println(p1.name());

        Person p3 = new Person("Morris", "Anderson", 22);
        System.out.println(p3.name());
        System.out.println(p2);
    }
}
