package com.chapter3_13;

public class ObjectMethods {
    public static void main(String[] args) {
        Person firstPerson = new Person("Morris");
        Person secondPerson = new Person("Denis");
        Person thirdPerson = new Person("Morris");

        System.out.println(firstPerson.toString());
        System.out.println(firstPerson.hashCode());
        System.out.println(secondPerson.hashCode());
        System.out.println();


        System.out.println(firstPerson.getClass());
        System.out.println(firstPerson.equals(secondPerson));
        System.out.println(firstPerson.equals(thirdPerson));



    }
}

class Person {
    private String name;

    public String getName() { return name; }

    Person(String name) {
        this.name = name;
    }

//    toString
    public String toString() {
        return "Person, name: " + getName();
    }

//    custom hash
    public int hashCode() {
        return getName().hashCode() + 100;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;

        Person p = (Person) o;
        return name.equals(p.getName());
    }


}
