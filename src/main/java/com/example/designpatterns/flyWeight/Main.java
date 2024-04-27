package com.example.designpatterns.flyWeight;

public class Main {
    public static void main(String[] args) {
        Bullet b1 = new Bullet();
        b1.name = "b1";
        b1.colour = "Red";
        b1.range = 100;

        Bullet b2 = new Bullet();
        b2.name = "b2";
        b2.colour = "Blue";
        b2.range = 50;

        Bullet b3 = new Bullet();
        b3.name = "b3";
        b3.colour = "Green";
        b3.range = 10;

        BulletFactory.addBullet(b1);
        BulletFactory.addBullet(b2);
        BulletFactory.addBullet(b3);

        for(int i = 0; i < 5; i++) {
            FlyingBullet flyingBullet = new FlyingBullet();
            flyingBullet.no = i;
            String s = "b" + ((i % 3) + 1);
            flyingBullet.bullet = BulletFactory.getBullet(s);

            System.out.println(flyingBullet.bullet.colour);
        }

    }
}
