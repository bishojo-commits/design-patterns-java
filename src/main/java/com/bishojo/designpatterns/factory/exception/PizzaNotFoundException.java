package com.bishojo.designpatterns.factory.exception;

public class PizzaNotFoundException extends RuntimeException {
    public PizzaNotFoundException(String message) {
        super(message);
    }
}
