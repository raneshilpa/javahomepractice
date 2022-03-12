package com.company;

public class SubClassExample extends SuperClassExample
{

    int num = 110;
   SubClassExample()
   {
       super("Shilpa");

       System.out.println("Constructor of child class");
   }


    void printNumber()
    {
        System.out.println(super.num);
        super.display();
    }

    public static void main(String[] args) {

        SubClassExample sub = new SubClassExample();
        sub.printNumber();


    }


}
