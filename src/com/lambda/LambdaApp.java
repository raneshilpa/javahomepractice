package com.lambda;


// when an interface will have exactly 1 abstract method we can say it  as a functional interface.
// functional interface
interface cab
{
    void bookCab();//by default public abstract void bookCab()
}
/*
class uberX implements cab
{
    @Override
    public void bookCab() {
        System.out.println(" UbberX booked ...arriving sooon");
    }
}*/


public class LambdaApp {



    public static void main(String[] args) {
        //1.
        // cab  c = new uberX();
        // c.bookCab();
        //2.
        //Ananymous class implementation
  /* cab b = new cab()
   {
       @Override
       public void bookCab() {
           System.out.println("Uberx booked ..arriving sooonnn");
       }
   };
   b.bookCab();  */

   //Using lambda expression //help us to write functional interface implementation with an ease
        // works with functional interfaces only
        cab b = ()->{
            System.out.println("Uberx is arrriving soon ..");
        };
        b.bookCab();


    }
}
