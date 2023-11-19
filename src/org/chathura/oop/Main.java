package org.chathura.oop;

public class Main {
    public static void main(String[] args) {

        Phone  iPhone=new Phone("iPhone 11",12,32,31);
//        iPhone.setName("iPhone 7");
        System.out.println(iPhone.getName());
        iPhone.playMusic("Shake it Off");
    }
}
