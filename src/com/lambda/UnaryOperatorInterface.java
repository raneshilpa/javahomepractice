package com.lambda;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {
   /*
   Represents an operation on a single operand that produces a result of the same type as its operand.
   This is a specialization of Function for the case where the operand and result are of the same type.
    */

    public static void main(String[] args) {
        UnaryOperator<Integer> func = x ->x*2;
        int i = func.apply(10);
        System.out.println(i);

        Function<Integer,Integer> func1 = x-> x*8;
        int result= func1.apply(30);
        System.out.println(result);

        List<String> langlist = new ArrayList<String>();
        langlist.add(("JAVA"));
        langlist.add(("RUBI"));
        langlist.add(("PYTHON"));
        System.out.println(langlist);

        langlist.replaceAll(ele->ele +" SHILPA");
        System.out.println(langlist);



    }
}
