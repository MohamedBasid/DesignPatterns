package com.example.designpatterns.decorator;

public class Gems implements IceCream{
    IceCream iceCream;
    Gems(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return this.iceCream.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return this.iceCream.getDescription() + " + gems";
    }
}
