package com.lambda;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterFindAnyOrElse {



    public static void main(String[] args) {
  //list of customer
        List<Customer> custList = Arrays.asList(
                new Customer("Abhay",20),
                new Customer("Diya",30),
                new Customer("Reena",56),
                new Customer("Tom",35),
        new Customer("Reena",56)
        );
        // filter -- find Any
        Customer customer =custList.stream().filter(x->"Tom".equals(x.getName())) //filter for Tom
                .findAny() //if it find return
                .orElse(null);
        System.out.println(customer.getName()+ " "+customer.getAge());
        System.out.println("-------------------------------");


        //did not find any or else

        Customer customer1 =custList.stream().filter(x->"Shilpa".equals(x.getName())) //filter for Shilpa
                .findAny() //if it find return
                .orElse(null);
        System.out.println(customer1);

        //Filter with multiple conditions
        Customer customer2 =custList.stream()
                .filter((x)-> "Reena".equals(x.getName()) && 56 ==x.getAge())
                .findAny()
                .orElse(null);

        System.out.println(customer2.getName()+ " "+customer2.getAge());








    }



}
