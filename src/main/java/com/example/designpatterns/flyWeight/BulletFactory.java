package com.example.designpatterns.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class BulletFactory {
    static Map<String, Bullet> map = new HashMap<>();

    static Bullet getBullet(String name) {
        return map.get(name);
    }

    static void addBullet(Bullet bullet){
        map.put(bullet.name, bullet);
    }
}
