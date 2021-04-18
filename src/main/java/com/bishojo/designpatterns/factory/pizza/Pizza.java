package com.bishojo.designpatterns.factory.pizza;

import com.bishojo.designpatterns.factory.ingredient.*;

import java.util.Arrays;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggie veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake Pizza");
    }

    public void cut() {
        System.out.println("Cut Pizza");
    }

    public void box() {
        System.out.println("Box Pizza");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clam=" + clam +
                '}';
    }
}
