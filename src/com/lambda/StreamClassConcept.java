package com.lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClassConcept {
  /*
  Some of the most prominent methods used in these examples are
  the filter() -  which allows elements that match the predicate,
  count() - which counts the number of items in a stream,
  map() - which applies a function in each element of Stream for transformation,
  and collect() - which collects the final result of Stream processing into a Collection.

   */


    public static void main(String[] args) {
     List<String> list = Arrays.asList("Shilpa","","Parul","","Kavita","","Tina","Ram","Pawan");

        //Counting Empty String

        long count = list.stream()
                .filter(x -> x.isEmpty())
                .count();
        System.out.println("Empty strings are "+count);

        //Count String whose length is more than three
        long count1 = list.stream()
                .filter((x -> x.length() > 3))
                .count();
        System.out.println("String length greater than 3 are "+count1);

        //Count number of String which starts with "a"
        long p = list.stream()
                .filter((x -> x.startsWith("P")))
                .count();
        System.out.println("String starts with P letter "+p);

        //Remove all empty Strings from List
        List<String> collect = list.stream()
                .filter(x -> !x.isEmpty())
                .collect(Collectors.toList());
        System.out.println(collect);

        //Create a List with String more than 3 characters
        List<String> collect1 = list.stream()
                .filter(x -> x.length() > 3)
                .collect(Collectors.toList());
        System.out.println(collect1);

        //Convert String to uppercase and Join them with coma
        List<String> arrlist =Arrays.asList("canada","india","usa","london","paris");
        String collect2 = arrlist.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(collect2);


        //Create a List of the square of all distinct numbers
       List<Integer> number = Arrays.asList(2,4,4,5,2,3);
        List<Integer> collect3 = number.stream()
                .map(i -> i * i)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect3);


        //Get count, min, max, sum, and the average for numbers
        IntSummaryStatistics intSummaryStatistics = number.stream()
                .mapToInt((x) -> x)
                .summaryStatistics();
        System.out.println("maximum number is :"+intSummaryStatistics.getMax());
        System.out.println("smallest number is :"+intSummaryStatistics.getMin());
        System.out.println("count :"+intSummaryStatistics.getCount());
        System.out.println("Avg :"+intSummaryStatistics.getAverage());
        System.out.println("Sum is :"+intSummaryStatistics.getSum());




    }

}
