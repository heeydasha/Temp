package com.dasha;
public class Parrot {
    public static void main(String[] argv) {

        System.out.print("Enter farienhiet temp> ");

        java.util.Scanner in = new java.util.Scanner(System.in);
        String text = in.next();        // Get the next word
        double tempInF = Double.parseDouble(text);
        double celcius =   ((tempInF - 32) * 5)/9;
        System.out.println("Your word is: " + celcius);
    }
}
