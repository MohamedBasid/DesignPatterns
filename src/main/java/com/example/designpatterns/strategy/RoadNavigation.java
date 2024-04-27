package com.example.designpatterns.strategy;

public class RoadNavigation implements NavigationStrategy{
    @Override
    public void navigate() {
        System.out.println("Road Navigation called");
    }
}
