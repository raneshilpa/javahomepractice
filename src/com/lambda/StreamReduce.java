package com.lambda;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {

    public static void main(String[] args) {

        //In Java 8, the Stream.reduce() combine elements of a stream and produces a single value.
        int[] numbers ={1,2,3,4,5,6};
        int reduce = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
        System.out.println(reduce);

        List<Integer> nums = List.of(1,2,3,4,5);
        System.out.println(nums.stream().reduce(0,(a,b)->a+b));
        System.out.println(nums.stream().reduce(0,Integer::sum));

        Integer max = nums.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("Maximum number is : "+max);

        System.out.println(nums.stream().reduce(0, Integer::max));

        Integer min = nums.stream().reduce(0, (a, b) -> a < b ? a : b);
        System.out.println("Minimum number is : "+min);
        System.out.println(nums.stream().reduce(0, Integer::min));


        String[] strings = {"a", "b", "c", "d", "e"};

        // |a|b|c|d|e , the initial | join is not what we want
        String re = Arrays.stream(strings).reduce("", (a, b) -> a + "|" + b);
        System.out.println(re);

        // a|b|c|d|e, filter the initial "" empty string
        String reduce2 = Arrays.stream(strings).reduce("", (a, b) -> {
            if (!"".equals(a)) {
                return a + "|" + b;
            } else {
                return b;
            }
        });
        System.out.println(reduce2);

        // a|b|c|d|e , better uses the Java 8 String.join :)
        String join = String.join("|", strings);
        System.out.println(join);


    }
}
