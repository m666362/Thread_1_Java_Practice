package org.richit.thread_lib;

public class Runner extends Thread {

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println("Thread " + i);
            try {
                sleep( 1000 );
            } catch (InterruptedException e) {
                System.out.println( e.toString() );
            }
        }
    }
}
