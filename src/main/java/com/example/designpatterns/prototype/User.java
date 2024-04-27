package com.example.designpatterns.prototype;

public class User {//implements Cloneable{
    public int id;
    public String name;
    public String role;

    public User() {
    }
    public User(User user) {
        this.name = user.name;
        this.role = user.role;
    }

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    /*protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }*/

}
