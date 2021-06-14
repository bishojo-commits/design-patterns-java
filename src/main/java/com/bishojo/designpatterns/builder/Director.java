package com.bishojo.designpatterns.builder;

public class Director {
    private BuilderInterface builder;

    public void construct(BuilderInterface builder) {
        this.builder = builder;
        builder.buildBody();
        builder.addHeadlights();
        builder.insertWheels();
    }
}
