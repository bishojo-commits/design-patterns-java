package com.bishojo.designpatterns.prototype.dance_styles;

public abstract class DanceStyle implements Cloneable {
    private String id;
    protected String type;

    abstract public void createDancer();

    public DanceStyle clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return (DanceStyle) clone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }
}
