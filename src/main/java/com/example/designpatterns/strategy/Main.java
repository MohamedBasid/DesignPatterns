package com.example.designpatterns.strategy;

public class Main {
    public static void main(String[] args) {
        NavigationStrategy strategy = new RoadNavigation();
        Vehicle car = new Vehicle(strategy);
        car.navigate();
    }
}
