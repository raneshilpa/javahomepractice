package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {



    public static void main(String[] args) {
        //list of customer
        List<Customer> custList = Arrays.asList(
                new Customer("Abhay",20),
                new Customer("Diya",30),
                new Customer("Reena",56),
                new Customer("Tom",35),
                new Customer("Reena",56)
        );

        String name = custList.stream()
                .filter(x->"Tom".equals(x.getName()))
                .map(Customer::getName)
                .findAny()
                .orElse(null);
        System.out.println(name);

        //print all names from the list

        List <String> cust1 = custList.stream()
                .map(Customer::getName)
                .collect(Collectors.toList());
        cust1.forEach(System.out ::println);





    }
}
