package com.chapter3_27;

public class Author implements Cloneable{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    Author(String name) {
        this.name = name;
    }
    public Author clone() throws CloneNotSupportedException {
        return (Author) super.clone();
    }
}
