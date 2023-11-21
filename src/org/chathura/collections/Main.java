package org.chathura.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //defining arryalists
        //ArrayList
        ArrayList<String> names=new ArrayList<>();

        //using List interface
        List<String> students=new ArrayList<>();

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


        System.out.println(names.isEmpty());
    }
}
