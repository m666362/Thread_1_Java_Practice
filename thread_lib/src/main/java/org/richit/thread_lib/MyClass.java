package org.richit.thread_lib;

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
        Runner runner1 = new Runner();
        runner1.start();

        Runner runner2 = new Runner();
        runner2.start();
    }

}
