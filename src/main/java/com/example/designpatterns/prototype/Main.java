package com.example.designpatterns.prototype;

public class Main {
    public static void main(String[] args) {
        UserRegistry registry = new UserRegistry();

        User user1 = new User();
        user1.name = "Basid";
        user1.role = "Partner";

        User user2 = new User();
        user2.name = "Balaji";
        user2.role = "Admin";

        registry.addUser(user1);
        registry.addUser(user2);

        User user3 = registry.getUser("Partner");
        user3.id = 1;
        System.out.println(user3.name);

    }
}
