package com.javacore;

public class RevString {

    public static void reverseString()
    {
        // java program to reverse a word

        String str = "I LOVE JAVA",strRev="";
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

    public static void main(String[] args) {
        reverseString();
    }


}
