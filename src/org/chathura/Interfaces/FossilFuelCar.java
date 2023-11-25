package org.chathura.Interfaces;

public class FossilFuelCar implements CarInterface{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FossilFuelCar(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Explosion in cylinder caused the engine to start");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName()+" is moving at "+speed+" mph.");
    }
}
