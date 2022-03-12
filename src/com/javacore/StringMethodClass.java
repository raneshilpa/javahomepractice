package com.javacore;

import jdk.swing.interop.SwingInterOpUtils;

public class StringMethodClass {

    public static void main(String[] args) {
     charAtMethod();
     compareToMethod();
     concatStringMethod();
     endWithMethod();
     //replaceMethod();
    // lastIndexMethod();
    getMiddleString();
    }
    public static void charAtMethod()
    {
        //The charAt() method returns the character at the specified index in a string.
        //
        //The index of the first character is 0, the second character is 1, and so on.
        String str = "This is core Java";
        char c = str.charAt(3);
        System.out.println(c);
    }
    public static void compareToMethod()
    {
      String str1= "Java";
      String str2="Java";
      String str3= "java2";

      System.out.println(str1.compareTo(str2)); // Returns 0 because they are equal
       /* compareToIgnoreCase Returns:	An int value: 0 if the string is equal to the other string, ignoring case differences.
            < 0 if the string is lexicographically less than the other string
            > 0 if the string is lexicographically greater than the other string (more characters) */
        System.out.println(str1.compareToIgnoreCase(str3));

    }
    public static void splitStringMethod()
    {
        //word as a regular expression in Java String split method
        String str = "helloxyzhixyzbye";
        String[] arr = str.split("xyz");

        for (String s : arr)
            System.out.println(s);

        //splitting string based on whitespace
        String str5 = "My name is Chaitanya";
        //regular expression is a whitespace here
        String[] arr3 = str.split(" ");

        for (String s : arr3)
            System.out.println(s);
    }

    public static void concatStringMethod()
    {
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
        System.out.println(firstName+lastName);
    }
    public static void endWithMethod()
    {
        String myStr = "Hello";
        System.out.println(myStr.endsWith("Hel"));   // false
        System.out.println(myStr.endsWith("llo"));   // true
        System.out.println(myStr.endsWith("o"));     // true

        System.out.println(myStr.startsWith("He"));

        System.out.println(myStr.toLowerCase());
        System.out.println(myStr.toUpperCase());


    }
    public static void replaceMethod()
    {
        String str = new String("Site is BeginnersBook.com");

        System.out.print("String after replacing all 'o' with 'p' :" );
        System.out.println(str.replace('o', 'p'));

        System.out.print("String after replacing all 'i' with 'K' :" );
        System.out.println(str.replace('i', 'K'));


        //The difference between replaceFirst() and replaceAll() method is that
        // the replaceFirst() replaces the first occurrence while replaceAll() replaces all the occurrences.
        String str33 = new String("Site is BeginnersBook.com");

        System.out.print("String after replacing com with net :" );
        System.out.println(str33.replaceFirst("com", "net"));

        System.out.print("String after replacing Site name:" );
        System.out.println(str33.replaceFirst("Beginners(.*)", "XYZ.com"));

    String str4 = new String("My .com site is BeginnersBook.com");
	System.out.print("String after replacing all com with net: " );
	System.out.println(str4.replaceAll("com", "net"));

	System.out.print("Replacing whole String: " );
	System.out.println(str4.replaceAll("(.*)Beginners(.*)", "Welcome"));
    //The difference between replace() and replaceAll() method is that the replace() method replaces all
        // the occurrences of old char with new char while replaceAll() method replaces all the occurrences
        // of old string with the new string.
        // Basically replace() works with replacing chars and replaceAll() works with replacing part of strings.

}

public static void lastIndexMethod()
{
    String strr="JAVA";
    

}

public static void getMiddleString()
{
    /* int stringLength = myStr.length() ;

        int middle = stringLength/2 ;

        char c = myStr.charAt(middle);*/
    String phrase = "Candy";
    int phraseLength = phrase.length();
    String middle3 = phrase.substring(phraseLength/2 - 1, phraseLength/2 + 2);
    System.out.println("String is :"+phrase+" middle is  " +middle3);

}



}
