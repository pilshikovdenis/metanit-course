package com.chapter3_1;

public class Employee extends Person{
    private String company;

    public String getCompany() {
        return company;
    }
    Employee(String name, String company) {
        super(name);
        this.company = company;
    }
    void display() {
        System.out.printf("i am employee.my name is %s. i'm work " +
                "in %s\n", getName(), getCompany());
    }
}
