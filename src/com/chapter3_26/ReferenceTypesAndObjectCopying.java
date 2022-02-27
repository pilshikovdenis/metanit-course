package com.chapter3_26;

public class ReferenceTypesAndObjectCopying {
    public static void main(String[] args) {
//        cloning simple objects without classes as fields
        try {
            Person tom = new Person("Tom", 22);
            tom.display();
            Person garry = tom.clone();
            garry.setName("Garry");
            tom.display();
            garry.display();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clonable not implemented");
        }


    }
}
