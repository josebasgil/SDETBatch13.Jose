package com.syntax.javaclass20;

public class SuperDemo {
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}
class Furniture{
    String name="Table";
    String color="Black";
}
class Chair extends Furniture{
    String color="Grey";
    void printColor(){
        String color="White";
        System.out.println(this.color); // the color of the class
        System.out.println(color); // the color inside the void
        System.out.println(super.color);// When I put super.color it use the color from the father class
    }
}