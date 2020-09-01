package com.codewithphencharaud;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void honk(){
        System.out.println("Honk! Honk!");
    }

    public void seatBeltAlert(){
        System.out.println("Beep! Beep! Beep! Beep!");
    }
    public String getCarInfo() {
        return ("My car model is "+model+", make is "+make+", year is "+year);
    }
}

class GasPriceForMyCar extends Car {
    private double gasPrice;
    private int tankGallon;

    public GasPriceForMyCar (double gasPrice, int tankGallon, String make, String model, int year){
        super(make, model, year);
        this.gasPrice = gasPrice;
        this.tankGallon = tankGallon;
    }

    public double setTotalCostForGas(){
        return gasPrice*tankGallon;
    }


}