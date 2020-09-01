package com.codewithphencharaud;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "white";
        myCar.model = "toyota";
        myCar.make = "corolla";
        System.out.println(myCar.getInfo());
    }
}
