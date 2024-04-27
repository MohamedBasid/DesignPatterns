package com.example.designpatterns.factory;

import com.example.designpatterns.prototype.User;

public class AdminFactory implements UserFactory {
    public User getUser(User user) {
        return new Admin(user.name);
    }
}
