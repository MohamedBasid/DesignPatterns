package com.example.designpatterns.factory;

import com.example.designpatterns.prototype.User;

public class Admin extends User {
    public Admin(String name) {
        super(name, "Admin");
    }
}
