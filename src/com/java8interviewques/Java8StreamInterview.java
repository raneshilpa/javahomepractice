package com.java8interviewques;

import java.util.*;
import java.util.stream.Collectors;

public class Java8StreamInterview {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,10,20,30,15);

        //1,100,400,900,225
        //400,900,225
        //1525/3=508.3333
        double asDouble = nums.stream().map(i -> i * i)
                .filter(i -> i > 100)
                .mapToInt(e -> e)
                .average()
                .getAsDouble();
        System.out.println(asDouble);

        //sum of all numbers
        List<Integer> nums1 = Arrays.asList(1,2,3,4,5,2,5,3,7,8);
        Integer reduce = nums1.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Addition of all numbers :"+reduce);

        OptionalDouble average = nums1.stream().mapToDouble(e -> e).average();
        System.out.println("Avarage is :"+average.getAsDouble());

        //find duplicate numbers
        Set<Integer> collect = nums1.stream().filter(e -> Collections.frequency(nums1, e) > 1).collect(Collectors.toSet());
        System.out.println(collect);

        //using set. set cananot contain duplicate values
        Set<Integer> dupnums = new HashSet<Integer>();
        Set<Integer> collect1 = nums1.stream().filter(e -> !dupnums.add(e)).collect(Collectors.toSet());
        System.out.println(" Duplicate numbers using set :"+collect1);

        //Collections.frequency
        System.out.println("Frequency of 3 is : "+Collections.frequency(nums1,3));

        //sorting list using streams
        List<Integer> collect2 = nums1.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list :"+collect2);

        List<Integer> collect3 = nums1.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted list in descending order "+collect3);

        //Get/ignore first 5 numbers using Limit & Skip in Streams
        //get first 5 numbers and sum of 5 numbers
        List<Integer> collect4 = nums1.stream().limit(5).collect(Collectors.toList());
        System.out.println("First 5 numbers : "+collect4);

        Integer integer = nums1.stream().limit(5).reduce((a, b) -> a + b).get();
        System.out.println("Sum of first 5 numbers :"+integer);

        //skip
        List<Integer> collect5 = nums1.stream().skip(5).collect(Collectors.toList());
        System.out.println(" Skiped first 5 numbers :"+collect5);

        //Get Second Highest/Lowest Number using Streams

        Integer integer1 = nums1.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("Second Highest Number :"+integer1);

        //second lowest

        Integer integer2 = nums1.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println("Second lowest number :"+integer2);



    }
}

