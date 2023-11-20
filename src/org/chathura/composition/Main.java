package org.chathura.composition;

public class Main {
    public static void main(String[] args) {
//        Engine engine=new Engine("Renault",8000);
        Car mercedes=new Car("Mercedes AMG",2,"Silver",new Engine("Renault",8000));
        System.out.println(mercedes.getEngine().getModel());

        Car nisaan = null;

        if(nisaan != null){
            nisaan.getName();
        }else{
            System.out.println("Null");
        }

        final Engine engine = new Engine("Renault",8000);
//        engine = new Engine("Renault",999); wont work
        engine.setRpm(999);
        System.out.println(engine.getRpm());

    }
}
