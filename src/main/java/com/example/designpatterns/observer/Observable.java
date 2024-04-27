package com.example.designpatterns.observer;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void sendNotification();
    void updateStock();
}
