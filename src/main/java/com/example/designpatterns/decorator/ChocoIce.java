package com.example.designpatterns.decorator;

public class ChocoIce implements IceCream{
    IceCream iceCream;
    ChocoIce(IceCream iceCream) {
        this.iceCream = iceCream;
    }


    @Override
    public int getCost() {
        return this.iceCream.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return this.iceCream.getDescription() + " + chocoIce";
    }
}
