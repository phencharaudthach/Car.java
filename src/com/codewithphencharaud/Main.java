package com.codewithphencharaud;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2018);
        GasPriceForMyCar totalCostForGas = new GasPriceForMyCar(2.12, 11, "Toyota", "Corolla", 2018);
        myCar.seatBeltAlert();
        myCar.honk();
        System.out.println(myCar.getCarInfo());
        System.out.print("The cost to fill up my gas tank is $"+totalCostForGas.setTotalCostForGas());
    }
}
