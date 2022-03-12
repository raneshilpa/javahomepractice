package com.javacore;

public class ConstructorClass
{
    private String name;

   ConstructorClass()
   {
       System.out.println("Default Constructor called");
       name = "Shilpa";

   }



    public static void main(String[] args)
    {
        ConstructorClass obj = new ConstructorClass();
        System.out.println("The Name is :"+obj.name);
        EmployeeClass emp2 =new EmployeeClass(10003,"Atharv");
        emp2.info();

    }

}
