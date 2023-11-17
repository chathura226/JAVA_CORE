package org.chathura.challenge1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the game");
        System.out.print("Enter Your name: ");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        System.out.println("Hello "+name);
        System.out.print("Should we start the game?");
        System.out.println("\t1.Yes");
        System.out.println("\t2.No");
        int val=scanner.nextInt();
        if(val==1){
            Random random=new Random();
            int rNum=random.nextInt(10);
            System.out.print("Enter your guess: ");
            int guess=scanner.nextInt();
            int i=1;
            for(i=1;i<5;i++){
                if(guess==rNum){
                    System.out.println("Congratulations! You win");
                    break;
                }else {
                    if(guess<rNum){
                        System.out.println("Guess Higher!");
                    }else{
                        System.out.println("Guess Lower!");
                    }
                    System.out.print("Enter your guess: ");
                    guess=scanner.nextInt();
                }
            }
            if (i == 5) {

                System.out.println("You are out of guesses!. You lose!");
            }
        }else{
            System.out.println("Exiting!");
        }

    }
}
