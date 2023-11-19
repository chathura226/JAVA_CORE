package org.chathura.OOP2;

public class Bird extends Animal{

    private int wings;

    public Bird(String name, String color, int legs, boolean hasTail, int wings) {
        super(name, color, legs, hasTail);
        this.wings = wings;
    }

    @Override
    public void eat(String food) {
//        super.eat(food);
        System.out.println("Eating finished");
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public void fly(){
        System.out.println(this.getName()+" is flying.");
    }
}
