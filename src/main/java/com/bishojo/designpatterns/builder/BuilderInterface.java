package com.bishojo.designpatterns.builder;


public interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Vehicle getVehicle();
}
