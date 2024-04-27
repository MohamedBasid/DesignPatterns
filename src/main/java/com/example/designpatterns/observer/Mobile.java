package com.example.designpatterns.observer;

public class Mobile implements Observer{

    public String name;
    @Override
    public void sendNotification() {
        System.out.println("Notification sent to " + name + " mobile");
    }
}
