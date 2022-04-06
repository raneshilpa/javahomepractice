package com.lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept
{

    public static void main(String[] args) {
        /*
        Represents an operation upon two operands of the same type,
         producing a result of the same type as the operands.
        This is a specialization of BiFunction for the case where the operands and
        the result are all of the same type.
         */
        BinaryOperator <Integer> func =(x1,x2)->x1+x2;
        int i = func.apply(10, 20);
        System.out.println(i);

        //Bi function interface
        BiFunction<Integer,Integer,Integer> func2 =(x1,x2)->x1+x2;
        int result =func2.apply(20,20);
        System.out.println(result);





    }
}
