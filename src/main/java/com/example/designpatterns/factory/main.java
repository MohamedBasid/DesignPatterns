package com.example.designpatterns.factory;

import com.example.designpatterns.prototype.User;

public class main {

    public static void main(String[] args) {
        User user = new User();
        user.name = "Honey";

        UserFactory factory = new PartnerFactory();
        User user1 = factory.getUser(user);

        System.out.println(user1.role);

    }
}
