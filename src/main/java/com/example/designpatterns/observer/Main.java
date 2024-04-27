package com.example.designpatterns.observer;

public class Main {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        mobile1.name = "basid";
        Mobile mobile2 = new Mobile();
        mobile2.name = "zayd";
        Web web1 = new Web();
        web1.name = "salih";

        Observable product = new IPhone();
        product.subscribe(mobile1);
        product.subscribe(mobile2);
        product.subscribe(web1);
        product.updateStock();
        System.out.println("------------------");
        product.unsubscribe(mobile2);
        product.updateStock();
    }
}
