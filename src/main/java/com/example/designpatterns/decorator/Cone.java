package com.example.designpatterns.decorator;

public class Cone implements IceCream{


    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Cone";
    }
}
