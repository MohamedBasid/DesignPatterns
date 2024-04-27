package com.example.designpatterns.factory;

import com.example.designpatterns.prototype.User;

public interface UserFactory {
    User getUser(User user);
}
