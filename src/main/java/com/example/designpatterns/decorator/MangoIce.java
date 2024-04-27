package com.example.designpatterns.decorator;

public class MangoIce implements IceCream{

    IceCream iceCream;
    MangoIce(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return this.iceCream.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return this.iceCream.getDescription() + " + mangoIce";
    }
}
