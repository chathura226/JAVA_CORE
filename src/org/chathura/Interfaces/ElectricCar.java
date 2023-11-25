package org.chathura.Interfaces;

//to use interace and make a class by it , use 'implements' keyword
public class  ElectricCar implements CarInterface {
    private String name;

    public ElectricCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(this);
        System.out.println("Electricity Flow Started...");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName()+" moveing at "+speed+" mph.");
    }
}
