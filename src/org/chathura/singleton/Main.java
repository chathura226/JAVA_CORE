package org.chathura.singleton;

public class Main {
    public static void main(String[] args) {

        Database database=Database.getInstance("MySql");
        System.out.println(database.getName());
    }
}
