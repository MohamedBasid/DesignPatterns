package com.example.designpatterns.factory;

import com.example.designpatterns.prototype.User;

public class PartnerFactory implements UserFactory{

    @Override
    public User getUser(User user) {
        return new Partner(user);
    }
}
