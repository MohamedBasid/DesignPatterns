package com.example.designpatterns.observer;

public class Web implements Observer{

    String name;
    @Override
    public void sendNotification() {
        System.out.println("Notification sent to "+name+" web");
    }
}
