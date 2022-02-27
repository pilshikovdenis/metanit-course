package com.chapter3_27;

public class CloningComplexDataTypes {
    public static void main(String[] args) {
//        now we can clone objects, who contain references on another objects ass fields
//        all classes, which usings as fields must implement clone()


        try {
            Book book = new Book("Сказка о царе салтане", "A.C Пушкин");
            Book book1 = book.clone();
            book1.setAuthor("В.К Чайковский");
            System.out.println(book);
            System.out.println(book1);
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloneable not implemented");
        }
    }
}
