package org.chathura.concurrency;

public class Excep {
    public static void main(String[] args) {
        int a=2;
        int b=0;
        try{
            System.out.println(a / b);
        }catch(ArithmeticException e){
            System.out.println("Divided by zero");
        }


        //if we dont know the type of exception, we can use generic exception type as below
        String name=null;
        try{
            name.equals("chathura");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
