package com.lambda;

public class LambdaDeclaration {

    public static void main(String[] args) {

//        WebPage w1 = new WebPage() {
//            @Override
//            public void header(String value) {
//                System.out.println("hi "+value);
//            }
//        };
//
//      w1.header("Google");

        WebPage w1 = (value,age)->{System.out.println("Hi "+value+ "Age --> "+age);};
//        WebPage w2 = (value)->{System.out.println(value.toUpperCase());};
//
//        WebPage w3 = (value)->System.out.println(value.toLowerCase());
//
//        WebPage w4 = (n)->{System.out.println(n.length());};

        w1.header("Tom", 20);
//        w2.header("facebook");
//        w3.header("JAVA");
//        w4.header("youtube");


    }


}
