package org.chathura.Static;

public class Main {
    public static void main(String[] args) {
        TestClass testClass=new TestClass(33,"black");
        TestClass.setName("deede");
        System.out.println(TestClass.getName());
        TestClass.name="DEw";
        System.out.println(TestClass.getName());

        TestClass secondTest=new TestClass(22,"dded");
        System.out.println(secondTest.name);

        TestClass.printSomething();
    }
}
