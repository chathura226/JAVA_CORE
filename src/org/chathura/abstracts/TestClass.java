package org.chathura.abstracts;

//to use interfaces , we have to use  'implements' keyword
//to use abstract classes, we only have to use 'extends' keyword
//unlike interfaces, abstract claases doesnt support multiple inheritance
public class TestClass extends TestAbstractClass{
    public TestClass(String name) {
        super(name);
    }

    @Override
    public void printName(String name) {
        System.out.println("Name is "+name);
    }

}
