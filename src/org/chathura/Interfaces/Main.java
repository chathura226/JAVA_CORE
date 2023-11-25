package org.chathura.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        CarInterface carInterface=new CarInterface() {
//            @Override
//            public void start() {
//
//            }
//
//            @Override
//            public void move(int speed) {
//
//            }
//        }

        CarInterface carInterface=new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(20);

        //since we are implmenting multiple interfaces on FossilFuelClass
        FossilFuelCar fossilCar=new FossilFuelCar("Mercedes");
        fossilCar.start();
        fossilCar.move(10);
        fossilCar.printName("dedde");
    }
}
