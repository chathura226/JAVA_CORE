package org.chathura.OOP2;

import java.security.PrivateKey;

public class Dog extends Animal{
    public Dog(String name, String color, int legs, boolean hasTail) {
        super(name, color, legs, hasTail);
    }

    @Override
    public void eat(String food) {
        System.out.println("Chewing "+food);
    }
}
