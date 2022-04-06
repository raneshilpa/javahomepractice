package com.lambda;

import java.util.function.Function;

public class FunctionalInterfaceConcept
{
//    Interface Function<T,R>
//    Type Parameters:
//    T - the type of the input to the function
//    R - the type of the result of the function


    public static void main(String[] args) {

    Function<String,Integer> fun = x-> x.length();
    int len =fun.apply("This is functionalInterface");
        System.out.println(len);

    //chaining function
        Function<Integer,Integer> fun2 = x-> x * 2 ;
        int result = fun.andThen(fun2).apply("Shilpa");
        System.out.println(result);


    }

}
