package org.chathura.loops;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int i=0;i<10;i++){
            System.out.println("HI");
        }


        int i=10;
        while (i>0){
            System.out.println(i);
            i--;
        }

        do {
            i++;
            System.out.println(i);
        }while (i<10);
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int ans=scanner.nextInt();
        System.out.println(ans);

        System.out.print("Enter your name: ");
        String name=scanner.next();
        System.out.println("Name was "+name);

        Random random=new Random();
        for (int j=0;j<5;j++) {
            int num = random.nextInt();
            System.out.println(num);
        }
        for (int j=0;j<5;j++) {
            int num = random.nextInt(20);
            System.out.println(num);
        }
    }
}
