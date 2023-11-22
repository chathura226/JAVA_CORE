package org.chathura.collections;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        //defining arryalists
        //ArrayList
        java.util.ArrayList<String> names=new java.util.ArrayList<>();

        //for integer arraylist. Cannot use primitive types with array list. have to use objects
        java.util.ArrayList<Integer> intArr=new java.util.ArrayList<>();

        //using List interface
        List<String> students=new java.util.ArrayList<>();

        //adding elements to array lists
        names.add("Sajith");

        //retrive elements from array lists
        System.out.println(names.get(0));

        System.out.println(names.size());

        //clear all elements
        names.clear();

        System.out.println(names.size());

        names.add("chathura");
        names.add("Nipun");

        names.remove("chathura");

        System.out.println(names.get(0));

        //check exsistence
        System.out.println(names.contains("Ramindu"));
        System.out.println(names.contains("Nipun"));

        //get index
        System.out.println(names.indexOf("Nipun"));
        System.out.println(names.indexOf("Dewdw"));


        //check emptiness
        System.out.println(names.isEmpty());

    }
}
