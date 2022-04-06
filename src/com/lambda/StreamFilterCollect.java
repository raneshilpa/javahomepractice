package com.lambda;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollect {



    public static void main(String[] args) {

        List<String> prodList = Arrays.asList("MACBOOK", "IPHONE","BATTERY CHARGER","CABLE");
        System.out.println(prodList);
        prodList.forEach(ele-> System.out.println(ele));
        System.out.println("-----------------");
       List<String> result = prodList.stream()
                .filter(ele-> !ele.equals("CABLE"))
                .collect(Collectors.toList());

       result.forEach(ele-> System.out.println(ele));

       result.forEach(System.out::println);





    }
}
