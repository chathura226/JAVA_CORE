package org.chathura.OOP2;

public class Main {
    public static void main(String[] args) {
        Bird phoenix=new Bird("Nina","Golden",2,false,2);
        System.out.println(phoenix.getName());
        phoenix.eat("Meat");

        System.out.println(phoenix.getWings());
        phoenix.fly();
    }
}
