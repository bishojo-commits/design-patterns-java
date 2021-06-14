package com.bishojo.designpatterns.observer.data;

import com.bishojo.designpatterns.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
