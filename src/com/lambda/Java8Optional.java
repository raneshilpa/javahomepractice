package com.lambda;

import java.util.Optional;

public class Java8Optional {

    public static void main(String[] args) {
        //create an object

        Optional<String> mystr1 = Optional.empty();
        System.out.println(mystr1);

        //optional.of
        Optional<String> mystr2 = Optional.of("First");

        //Optional.ofNullable()
        Optional<String> mystr3 =Optional.ofNullable(null);
        if (mystr3.isPresent())
        {
            System.out.println("mystr3 is not null : "+mystr3.get());
        }
        else
        {
            System.out.println("Mystr3 is null");
        }




    }
}
