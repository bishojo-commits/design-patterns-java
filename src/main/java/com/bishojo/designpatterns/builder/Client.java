package com.bishojo.designpatterns.builder;

public class Client {
    public static void main(String[] args) {
        System.out.println("Builder Pattern Demo");

        Director director = new Director();
        BuilderInterface car = new Car(new Vehicle());

        director.construct(car);
        car.getVehicle().show();
    }
}
