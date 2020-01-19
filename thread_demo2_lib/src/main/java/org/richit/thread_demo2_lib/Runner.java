package org.richit.thread_demo2_lib;

import static java.lang.Thread.sleep;

class Runner implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println("Hello " + i);
            try {
                sleep( 1000 );
            } catch (InterruptedException e) {
                System.out.println( e.toString() );
            }
        }
    }
}
