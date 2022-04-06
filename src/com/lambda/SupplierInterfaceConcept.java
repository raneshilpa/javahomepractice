package com.lambda;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {
    public static void main(String[] args) {
        //his is a functional interface and can therefore
        // be used as the assignment target for a lambda expression or method reference.
        //it takes no argument and return result

       getText(()->"java");
        getText(()->"Rubi");




    }
   public static void getText(Supplier<String> text)
   {
       System.out.println(text.get());
   }


}
