package org.chathura.oop;

public class Phone {
    private String name;
    int screenSize;
    int memory;
    int camera;

    public void playMusic (String trackName){
        System.out.println("Now playing "+trackName);
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return "Name is "+this.name;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}
