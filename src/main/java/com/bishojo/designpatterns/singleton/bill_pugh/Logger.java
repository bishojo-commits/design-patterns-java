package com.bishojo.designpatterns.singleton.bill_pugh;

public class Logger {

    private String info;

    private Logger() {
    }

    private static class InstanceCreator {
        private static final Logger uniqueInstance = new Logger();
    }

    public static Logger getInstance() {
        return InstanceCreator.uniqueInstance;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
