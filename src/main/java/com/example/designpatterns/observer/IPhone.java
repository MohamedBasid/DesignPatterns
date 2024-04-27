package com.example.designpatterns.observer;

import java.util.LinkedList;
import java.util.List;

public class IPhone implements Observable{

    List<Observer> observerList = new LinkedList<>();
    int stockCount = 0;

    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void sendNotification() {
        for(Observer observer : observerList) {
            observer.sendNotification();
        }
    }

    public void updateStock() {
        this.stockCount = 10;
        this.sendNotification();
    }
}
