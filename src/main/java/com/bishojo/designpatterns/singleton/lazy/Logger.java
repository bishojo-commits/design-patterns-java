package com.bishojo.designpatterns.singleton.lazy;

public class Logger {
    private volatile static Logger uniqueInstance = null;
    private String info;

    private Logger() {
    }

    public static Logger getInstance() {
        if (uniqueInstance == null) {
            //for thread safety double check locking
            synchronized (Logger.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Logger();
                }
            }
        }
        return uniqueInstance;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
