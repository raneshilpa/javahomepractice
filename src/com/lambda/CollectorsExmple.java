package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExmple {
/*
Collectors is a final class that extends Object class. It provides reduction operations,
such as accumulating elements into collections, summarizing elements according to various criteria, etc.
 */

    public static void main(String[] args) {
        List<Product> prodlist = Arrays.asList(
                new Product("laptop",2000,111),
                new Product("laptop2",1000,222),
                new Product("laptop3",4000,333),
                new Product("laptop4",1000,444)
        );

        //avg of price
        Double avg =prodlist.stream().collect(Collectors.averagingDouble(p->p.getPrice()));
        System.out.println("Avarage of price is "+avg);


        //Counting elements
        Long collect = prodlist.stream().collect(Collectors.counting());
        System.out.println("No of elements are :"+collect);

        //sum of price
        double totalprice = prodlist.stream().collect(Collectors.summingDouble(p->p.getPrice()));
        System.out.println("Sum of the prices are :"+totalprice);

        // fetching prices
        List<Float> collect1 = prodlist.stream()
                .map(p -> p.getPrice())
                .collect(Collectors.toList());
        System.out.println(collect1);


    }
}
