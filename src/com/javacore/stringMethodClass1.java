package com.javacore;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class stringMethodClass1 {

    public static void main(String args[]) {

        initialOfWord();
        firstAndLastOfWord();
        lastCharWord();
        reverseString();
        splitStrigMethod();
        replaceStringMethod();
        increStringSize();
        findOccurWord();
        vowelConsonantMethod();
        charOccCount();
        printDuplicateChar();
        stringToInt();
        palindromeString();
    }

    public static void initialOfWord()
    {
        //String containing first letter of every word in a given string with spaces
        String x = "Good Morning";
        String[] myName = x.split(" ");
        System.out.println(myName.length);
        for (int i = 0; i < myName.length; i++)
        {
            String s = myName[i];
            System.out.print(s.charAt(0));
        }

        System.out.println("\n"+" ----------------");
    }

    public static void firstAndLastOfWord() {

        //Print the first and last character of each word in a String
        int i;
        String str = "Geeks for Geeks";
        System.out.println(str.length());
        for (i = 0; i < str.length(); i++)
        {

            // If it is the first word
            // of the string then print it.
            if (i == 0)
                System.out.print(str.charAt(i));

            // If it is the last word of the string
            // then also print it.
            if (i == str.length() - 1)
                System.out.print(str.charAt(i));

            // If there is a space
            // print the successor and predecessor
            // to space.
            if (str.charAt(i) == ' ')
            {
                System.out.print(str.charAt(i - 1)
                        + " "
                        + str.charAt(i + 1));
            }

        }

    }

    public static void lastCharWord()
    {
        //last character of each word in string
        String str = "Hi Good Morning";
        System.out.println("String is : "+str);
        // Now, last word is also followed by a space
        str = str +" ";

        for(int i=0;i<str.length();i++)
        {
          if (str.charAt(i)== ' ')
          {
              System.out.print(str.charAt(i-1) + " ");
          }

        }
    }

    public static void reverseString()
    {
        // java program to reverse a word

        String str = "Morning",strRev="";
        char ch;
        System.out.println("Original String : "+str);
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            strRev= ch + strRev;
        }
        System.out.println("Reverse string is : "+strRev);
 /*
        int len=str.length();
        String rev="";

        for(int i=len-1;i>0;i--)
        {
            rev =rev+str.charAt(i);
        }
        sout(rev);
  */
        //using stringbufferclass

     StringBuffer sf = new StringBuffer(str);
        System.out.println(sf.reverse());


    }
    public static void splitStrigMethod()
    {
        String str = "Thexyzwebsitexyzisxyzsoftwaretestingxyzhelp";
        String[] split = str.split("xyz");
        for(String obj :split)
        {
            System.out.println(obj);

        }
    }
    public static void replaceStringMethod()
    {
        String str = "Thexyzwebsitexyzisxyzsoftwaretestingxyzhelp";
        System.out.println("Befor Replacement string is :"+str);
        String replace = str.replace("xyz", " ");
        System.out.println("After xyz to spaces replacement String is :  "+replace);
    }
    public static void increStringSize()
    {
        StringBuilder std = new StringBuilder("Java");
        System.out.println("String length is before increment size "+std.length());
        std.setLength(10);
        System.out.println("String length after increment size  "+std.length());

    }
    public static void findOccurWord()
    {
        String str ="This is my code, it is in Java.";
        System.out.println("The string is  : "+str);
       // String[] split = str.split("is");
        int count = (str.split("is").length)-1;
        System.out.println("Total occurrences of a substring in the given string: : " +count);
    }
    public static void vowelConsonantMethod()
    {
        String str = "BeginnersBook";
        int vcount=0;
        int ccount=0;
        str= str.toLowerCase();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vcount++;
            }
            else if(ch>='a'&&ch<='z')
            {
                ccount++;

            }

        }
        System.out.println("Number of vowel in string "+str+" is :"+vcount);
        System.out.println("Number of consonant in string "+str+" is :"+ccount);
    }

    public static void charOccCount()
    {
        String input = "aaaabbccAAdd";
        char ch ='a';
        int count=0;
        for (int i=0;i<input.length();i++)
        {
            if (input.charAt(i)== ch)
            {
                count++;
            }
        }
        System.out.println("The Character " +ch+ " appears " +count+ " times in the string "+input);
    }
    public static void printDuplicateChar()
    {
        String str ="w3schools";
        int cnt=0;
        char[] charArray = str.toCharArray();

        System.out.println("Duplicate Characters are : ");
        for(int i=0;i<str.length();i++)
        {
          for(int j =i+1;j<str.length();j++)
          {
              if(charArray[i] == charArray[j])
              {
                  System.out.println(charArray[j]);
                  cnt++;
                  break;

              }
          }
        }

    }
    public static void stringToInt()
    {
        String str ="12345";
        int i = Integer.parseInt(str);
        System.out.println("The string to integer is :"+i);

    }
    public static void palindromeString()
    {
        String inputString = "madam";
        String revString ="";

        for(int i=inputString.length()-1;i>=0;i--)
        {
            revString =revString +inputString.charAt(i);

        }
        if(inputString.equals(revString))
            System.out.println("Input string "+inputString+ " is palindrome String");
        else
            System.out.println("Input string "+inputString+ " is not palindrome String");
    }

}

