package org.richit.thread_demo2_lib;

public class MyClass {

    static String dot = "---------------";

    private static void heading(String heading) {
        System.out.println();
        System.out.println( dot + heading + dot);
        System.out.println();
    }

    public static void main(String[] args) {

        runSimutaneously();

    }

    private static void runSimutaneously() {
        heading( "Runner Class Started" );
        Thread thread1 = new Thread( new Runner() );
        thread1.start();
    }

}
