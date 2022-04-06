package com.lambda;
interface Cab
{
   // void bookCab(String source, String destination); // lambda expression with parameters
   double bookCab(String source,String destination);

}
public class LambdaClass {


    public static void main(String[] args) {
        Cab cab =(source,destination)->{
            System.out.println("Uberx booked from "+source+ " To "+destination+" arriving soon!!!!");
          return 850.50;

        };
        double fare = cab.bookCab("pune", "bombay");
        System.out.println(" fare shall be "+fare);

    }
}
