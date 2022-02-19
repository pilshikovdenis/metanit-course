//package com.chapter3;
//
//public class StaticMembersAndStaticModifier {
//    public static void main(String[] args) {
//        Human h1 = new Human("Morris", 12);
//        Human h2 = new Human("Jordan", 33);
//        Human h3 = new Human("Kent", 22);
//
//        System.out.println("count of humans equal " + Human.getCountOfHumans());
//        System.out.println("Human can fly " + Human.canFly);
//        System.out.println("Human can walk " + Human.canWalk);
//    }
//
//}
//
//class Human {
//    static int countOfHumans;
//    private String name;
//    private int age;
//
//    static final boolean canFly = false;
//    static final boolean canWalk = true;
//
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public int getAge() {
//        return age;
//    }
//
////    static method
//    public static int getCountOfHumans() {
//        return countOfHumans;
//    }
//
////    static initializer
//    static {
//        countOfHumans = 100;
//    }
//    Human(String name, int age) {
//        setName(name);
//        setAge(age);
//        countOfHumans++;
//    }
//}