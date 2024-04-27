package com.example.designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        IceCream iceCream = new Gems(new ChocoIce( new Cone()));
        // having a base class - cone here.
        // having a common interface and
        // all the add on classes should have another class underneath (boils down to base class)
        // Instead of having an object in all the add on classes, can have a common class with this object
        // and all add on constructors can refer the common class object.
        System.out.println("Cost: " + iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}
