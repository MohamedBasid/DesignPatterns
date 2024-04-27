package com.example.designpatterns.factory;

import com.example.designpatterns.prototype.User;

public class Partner extends User {

    public Partner(User user) {
        super(user.name, "Partner");
    }
}
