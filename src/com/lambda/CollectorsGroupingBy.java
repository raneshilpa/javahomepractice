package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsGroupingBy {


    public static void main(String[] args) {
        List<String> items = Arrays.asList("Apple", "Apple", "Banana","Apple", "Orange","Banana","Papaya");

        Map<String, Long> collect = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);




    }
}
