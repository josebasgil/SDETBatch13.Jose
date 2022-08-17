package com.syntax.javaclass18;

public class CarTester {
    public static void main(String[] args) {
        Car car1= new Car("Toyota", "Corolla", "Plate");
        car1.printInfo();
        Car car2= new Car("Fiat", "Uno", "Green");
        car2.printInfo();

        Car car=new Car("Tesla");
        car.printCarModel();
    }
}
