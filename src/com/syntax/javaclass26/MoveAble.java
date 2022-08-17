package com.syntax.javaclass26;

public interface MoveAble {
    void move();

}

class Car implements MoveAble{

    @Override
    public void move() {
        System.out.println("A car can move");
    }
    public void park(){
        System.out.println("you can park a car");
    }
}

class Person implements MoveAble{

    @Override
    public void move() {
        System.out.println("Humans can also move");
    }
}

class Test{
    public static void main(String[] args) {
        MoveAble moveAble= new Car(); // widening
        moveAble.move();
        //moveAble.park(); we can't us park method. Car can only do the things that interface allows
        ((Car)(moveAble)).park(); // narrowing .this is polimorphis I have to check the classes I haven't been

        // with intefases , we can also use polymorphism
        MoveAble [] moveAbles={new Car(), new Person()};
    }
}
