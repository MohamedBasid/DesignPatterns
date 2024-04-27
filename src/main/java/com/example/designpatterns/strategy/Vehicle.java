package com.example.designpatterns.strategy;

public class Vehicle {
    NavigationStrategy strategy;

    Vehicle(NavigationStrategy strategy){
        this.strategy = strategy;
    }
    void navigate(){
        this.strategy.navigate();
    }
}
