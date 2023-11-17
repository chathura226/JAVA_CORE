package org.chathura.operators;

public class Main {
    public static void main(String[] args) {
//        int a =5;
//        a=a+2;
//        System.out.println(a);
//        a+=2;
//        System.out.println(a);
//        a++;
//        System.out.println(a);

        int a =2;
        int b=3;
        boolean ans=a==b;
        System.out.println(ans);

        switch (a){
            case 1:
                System.out.println("A is one");
                break;
            case 2:
                System.out.println("A is two");
                break;
            case 3:
                System.out.println("A is three");
                break;
            default:
                System.out.println("A is not 1 or 2 or 3");
        }
    }
}
