package com.example.designpatterns.strategy;

public class WaterNavigation implements NavigationStrategy{
    @Override
    public void navigate() {
        System.out.println("Water navigation is called");
    }
}
