package com.javacore;

import jdk.swing.interop.SwingInterOpUtils;

public class StringPrograms {
    //count words in string
    public static void countWords(String str)
    {
     String[] split = str.split(" ");
     int wordCount=0;
     for(String st :split)
     {
         if(st.length()>=3)
         {
             wordCount++;
         }
     }
        System.out.println("Total words >=3 are :"+wordCount);
    }

    //reverse string
    public static void reverseString(String str)
    {
        String revstr="";
        for(int i=0;i<str.length();i++)
            revstr = str.charAt(i)+revstr;
        System.out.println("Reverse string is  : "+revstr);
    }
    //count character
    public static void countCharacters(String str)
    {
        int countChar=0;
        for(int i=0;i<str.length();i++)
            if((str.charAt(i)=='I') ||(str.charAt(i)=='i'))
            {
                countChar++;
            }
        System.out.println("Total Characters are "+countChar);
    }


    public static void main(String[] args)
    {
        String str ="I love java so much and it is very easy to learn.I love it so much";
        String str1 ="Java Tutorial";
        countWords(str);
        reverseString(str1);
        countCharacters(str);

    }
}
