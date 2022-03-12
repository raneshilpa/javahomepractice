package com.javacore;

public class StringSwapClass {
    public static void main(String[] args) {
        String firstString="Java";
        String secondString="Tutorial";
        System.out.println("Before swapping....");
        System.out.println("The first String  = " + firstString);
        System.out.println("The second String = " + secondString);

        firstString = firstString + secondString; // step 1
        secondString = firstString.substring(0, (firstString.length() - secondString.length())); // step 2
        firstString = firstString.substring(secondString.length()); // step 3
        System.out.println("\nAfter swapping....");
        System.out.println("The first String  = " + firstString);
        System.out.println("The second String = " + secondString);




    }
}
