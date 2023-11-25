package org.chathura.singleton;

public class Main {
    public static void main(String[] args) {

        Database database=Database.getInstance("MySql");
        System.out.println(database.getName());
//        System.out.println(database.toString()); //can use to string to get info about class
        //if want we can override the toString method ,
        System.out.println(database.toString());

    }
}
