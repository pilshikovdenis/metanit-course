package com.chapter3;



public class AbstractClasses {
    public static void main(String[] args) {
        Monkey jojo = new Monkey("Jojo", true);
        jojo.showInfo();

        Horse gerda = new Horse("Gerda", 40);
        gerda.showInfo();

//        another example - figures
        Rectangle rect = new Rectangle(57, 34, 100, 10);
        System.out.println(rect.getPerimeter());
        System.out.println(rect.getArea());
        System.out.println();

        Circle circle = new Circle(33, 12, 5);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());


    }
}

//abstract class
abstract class Animal {
    private String name;

    public String getName() {
        return name;
    };
    public void setName(String name) {
        this.name = name;
    }
    public abstract void showInfo();

    Animal(String name) {
        this.name = name;
    }
}

class Monkey extends Animal {
    private boolean stayInZoo;

    Monkey(String name, boolean isStayInZoo) {
        super(name);
        this.stayInZoo = isStayInZoo;
    }
    public void showInfo() {
        System.out.println("I am monkey. I am stay in the zoo: " + stayInZoo + ". My name is  " + getName());
    }

}

class Horse extends Animal {
    private int maxSpeed;

    Horse(String name, int maxSpeed) {
        super(name);
        this.maxSpeed = maxSpeed;
    }
    public void showInfo() {
        System.out.println("I am horse. My name is " + getName() + ". My max speed is " + maxSpeed);
    }
}


// another example
abstract class Figure {
    private float x;
    private float y;

    Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public abstract float getPerimeter();
    public abstract float getArea();
}

class Rectangle extends Figure {
    private float width;
    private float height;

    Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    public float getPerimeter() {
        return (width + height) * 2;
    }
    public float getArea() {
        return width * height;
    }
}

class Circle extends Figure {
    private float radious;

    Circle(float x, float y, float radious) {
        super(x, y);
        this.radious = radious;
    }
    public float getPerimeter() {
        return 3.14f * radious * 2;
    }
    public float getArea() {
        return 3.14f * radious * radious;
    }
}