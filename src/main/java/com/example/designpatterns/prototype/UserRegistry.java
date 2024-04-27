package com.example.designpatterns.prototype;

import java.util.HashMap;

public class UserRegistry {
    HashMap<String ,User> map;

    UserRegistry() {
        map = new HashMap<>();
    }

    public void addUser(User user){
        map.put(user.role, user);
    }
    public User getUser(String role){
        return map.get(role);
    }
}
