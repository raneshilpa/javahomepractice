package com.javacore;

public class WrapperClass
{
    public static void main(String[] args) {

        String s = "100";
        System.out.println(s+20);

        //data conversion string to integer

        int i = Integer.parseInt(s);
        System.out.println(i+20);

        //string to double
        String y ="11.100";
        double v = Double.parseDouble(y);
        System.out.println(v);

        //string to boolean
        String s1 ="true";
        boolean b = Boolean.parseBoolean(s1);
        System.out.println(b);

        //integer to string conversion
        int j= 100;
        System.out.println(j+20);
        String s2 = String.valueOf(j);
        System.out.println(s2);

        //String to integer
        String p ="100A"; // not correct the input string
        int i1 = Integer.parseInt(p);  // java.lang.NumberFormatException
        System.out.println(i1);



    }

}
