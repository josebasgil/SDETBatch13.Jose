package com.syntax.javaclass19;

class Book{
    String author;
    int pageCount;
    Book(String author){
        this.author=author;
    }
    Book(String author, int pageCount){
        this.author=author;
        this.pageCount=pageCount;
    }
}
public class Task9 {
    /*
    Write Book class that will have instance variables and 2 Constructors.
    While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */
    public static void main(String[] args) {
        Book book1=new Book("Tolkien");
        Book book2=new Book("Cervantes",5000);
    }

}
