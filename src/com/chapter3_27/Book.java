package com.chapter3_27;

public class Book implements Cloneable{
    private String name;
    private Author author;

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author.setName(author);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    Book(String name, String author) {
        this.name = name;
        this.author = new Author(author);
    }

    @Override
    public String toString() {
        return "Книга: " + name + " автор: " + author;
    }

    public Book clone() throws CloneNotSupportedException {
        Book newBook =  (Book) super.clone();
        newBook.author = (Author) author.clone();
        return newBook;
    }
}
