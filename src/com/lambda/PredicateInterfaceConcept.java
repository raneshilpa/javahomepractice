package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept
{
    //Represents a predicate (boolean-valued function) of one argument.

    public static void main(String[] args) {

        Predicate<Integer> func = x-> x > 5;

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> colllist = list.stream().filter(func).collect(Collectors.toList());
        System.out.println(colllist);

        //predicate with &&
        List <Integer> colllist1=list.stream().filter(x-> x>5 && x<8).collect(Collectors.toList());
        System.out.println(colllist1);

        //predicate with negate()
        List<String> list1 = Arrays.asList("naveen","navee","nave","java","jav","j");
        Predicate<String> namExp = x-> x.startsWith("nav");
       List<String> collect1= list1.stream().filter(namExp.negate()).collect(Collectors.toList());
        System.out.println(collect1);

    }
}
