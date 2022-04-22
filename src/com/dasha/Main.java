package com.dasha;

public class Main {

    public static void main(String[] args) {
        class Parrot {
            public static void main(String[] argv) {

                System.out.print("Howdy,lets convert!> ");

                java.util.Scanner in = new java.util.Scanner(System.in);
                String text = in.next();        // Get the next word

                System.out.println("Your word is: celcius " + text);
                java.util.Scanner myInput = new java.util.Scanner(System.in);
                myInput.next();
                int fahrenheit = myInput.nextInt();	   // Get input as an integer
                Object Celsius = new Object();
            }
        }


    }
}
