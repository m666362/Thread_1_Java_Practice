package org.richit.thread_lib3;

public class Processor extends Thread {

    private volatile boolean running = true;

    @Override
    public void run() {
        while (running){
            System.out.println("Hello...");
            try {
                Thread.sleep( 100 );
            } catch (InterruptedException e) {
                System.out.println( e.toString() );
            }
        }
    }

    public void shutdown(){
        running = false;
    }
}
