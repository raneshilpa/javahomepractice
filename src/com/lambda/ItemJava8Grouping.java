package com.lambda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ItemJava8Grouping {

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(

                new Item("Apple",10,new BigDecimal("9.99")),
                new Item("Banana",10,new BigDecimal("29.99")),
                new Item("Orange",40,new BigDecimal("19.99")),
                new Item("Watermelon",30,new BigDecimal("39.99")),
                new Item("Papaya",10,new BigDecimal("29.99")),
                new Item("Apple",10,new BigDecimal("9.99")),
                new Item("Banana",20,new BigDecimal("29.99"))

        );
/*
        Map<String, Long> collect = items.stream().collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
        System.out.println(collect);

        Map<String, Integer> collect1 = items.stream().collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
        System.out.println(collect1);

 */

        Map<BigDecimal, List<Item>> collect2 = items.stream().collect(Collectors.groupingBy(Item::getPrice));
        System.out.println(collect2);

        Map<BigDecimal, Set<String>> result =
                items.stream().collect(
                        Collectors.groupingBy(Item::getPrice,
                                Collectors.mapping(Item::getName, Collectors.toSet())
                        )
                );

        System.out.println(result);




    }
}
