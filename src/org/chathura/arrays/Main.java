package org.chathura.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String[] student=new String[5];
//        student[0]="chthura";
//        student[1]="chthura2";
//        student[2]="chthura3";
//        student[3]="chthura4";
//        student[4]="chthura5";
//        System.out.println(student[2]);
//
//        String[] employees={"Menaka","Menuka","Shavindi","Piumi"};
//        System.out.println(employees.length);
//
//        for (String l : employees) {
//            System.out.println(l);
//        }

        String[] names={"Chathura","Sajith","Nipun","Ramindu"};
        int[] numbers={1234,43434,434434,43324};
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

        System.out.println("Please enter a name: ");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.next();

        for (int i=0;i<names.length;i++){
            if (name.equals(names[i])){
                System.out.println(numbers[i]);
            }
        }
    }
}
