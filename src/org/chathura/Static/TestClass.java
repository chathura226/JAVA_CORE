package org.chathura.Static;

public class TestClass {
    public static String name;
    public int age;
    public String skinColor;

    public TestClass(int age, String skinColor) {
        this.age = age;
        this.skinColor = skinColor;
    }

    public void print(){

    }

    //we cannot refernece or use non static methods and variables inside a static class
    public static void printSomething(){
        System.out.println("Print somwthing");
    }
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        TestClass.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
}
