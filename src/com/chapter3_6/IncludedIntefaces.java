package com.chapter3_6;

public class IncludedIntefaces {
    public static void main(String[] args) {
        Printer.Printable p = new Journal("GQ");
        p.print();
    }
}
