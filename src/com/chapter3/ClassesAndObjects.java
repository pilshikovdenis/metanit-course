package com.chapter3;

public class ClassesAndObjects {
    public static void main(String[] args) {
//        Computer homePC = new Computer();
//        homePC.showInfo();

//        with constructor
        Computer workPC = new Computer("Acer", "Aspire 3", 58000);
        workPC.showInfo();


        Computer workPC2 = new Computer(80000);
        workPC2.showInfo();

        Computer socialPC = new Computer("Apple", "Macbook pro m1");
        socialPC.showInfo();
    }
}

class Computer {
    String brand;
    String model;
    int price;

    Computer(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    Computer(int price) {
        this.price = price;
        this.brand = "NoName";
        this.model = "NoModel";
    }

    void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

}
