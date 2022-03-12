package com.javacore;

public class ConstructorCocepts {
    String name; // class variable
    int age;

    public ConstructorCocepts()
    {
        System.out.println("This is default constructor");
        System.out.println("----------------------");
    }
    public ConstructorCocepts(int i) // constructor overloading
    {
        System.out.println("This is one paramter constructor");
        System.out.println("Value of i "+i);
        System.out.println("----------------------");
    }
    public ConstructorCocepts(int i, int j) //constructor overloading
    {
        System.out.println("This is two paramter constructor");
        System.out.println("Value of i and j "+i+ " "+j);
        System.out.println("----------------------");

    }
    public ConstructorCocepts(String name,int age)
    {
        this.name=name; //this.class var = local variable
        this.age =age;
        //name= name1;
        //age= age1

    }
    public static void main(String[] args) {
        ConstructorCocepts obj = new ConstructorCocepts();
        ConstructorCocepts obj1 = new ConstructorCocepts(10);
        ConstructorCocepts obj2 = new ConstructorCocepts(20,30);
        ConstructorCocepts obj3 = new ConstructorCocepts("shilpa",30);
        System.out.println(obj3.name);
        System.out.println(obj3.age);





    }
}
