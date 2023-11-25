package org.chathura.abstracts;

//like in interfaces, we cannot add body and implement methods in abstract classes. we have to override them
//unlike interfaces, we can add non abstract methods in abstract classes
//unlike interfaces, abstarct classes can have constructors and attributes
public abstract class TestAbstractClass {
    public abstract void printName(String name);

    private String name;

    public TestAbstractClass(String name) {
        this.name = name;
    }

    public void printl(){
        System.out.println("printMethod");
    }
}
