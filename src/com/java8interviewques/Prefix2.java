package com.java8interviewques;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prefix2 {
    //print numbers start with prefix 2 using stream

    public static void main(String[] args) {


        List<Integer> nums = Arrays.asList(2, 222, 234, 567, 890, 432, 236, 211, 22);
        //string.valueof() help to convert number to string
        List<Integer> numsstart2 = nums.stream().map(e -> String.valueOf(e))
                                   .filter(e -> e.startsWith("2"))
                                   .map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(numsstart2);




    }
}
