package org.richit.thread_lib3;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        Processor processor = new Processor();
        processor.start();

        System.out.println("Press Return to sotp...");
        Scanner scanner = new Scanner( System.in );
        scanner.nextLine();

        processor.shutdown();
    }
}
