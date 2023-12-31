package org.chathura.concurrency;

public class Main {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from another thread");
                for(int i=0;i<5;i++){
                    System.out.println("Printing "+i+" in a worker thread.");
                    //to sleep the tread
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();

        for(int i=0;i<5;i++){
            System.out.println("Printing "+i+" in a main thread.");
            //to sleep the tread
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
