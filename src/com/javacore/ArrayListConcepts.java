package com.javacore;



import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {
    public static void main(String[] args) {
    }
    }
        //   int a[] = new int[4]; static array //to resolve array out of bound exception we use dynamic array
        // Dynamic array  -ArrayList
        // adding duplicate values
        //it maintain insertion order.
        //it is not synchronized
        // allow random acess to fetch the element because it store the values on the basis of index
/*
       ArrayList arr = new ArrayList();
        arr.add(20); //0
        arr.add(30); //1
        arr.add(40); //2
        System.out.println(" size of array " +arr.size());

        arr.add(40); //3
        arr.add(50); //4
        arr.add(50); //5
        arr.add("test");
        arr.add('a');
        arr.add("true");

        System.out.println(arr.size()); // size of array

        System.out.println(arr.get(4)); // to get the value from the index
        System.out.println("--------------");
        // to print all values from array
        //for loop & using itreartor
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));

        }
        // non generic vs generic ///
        ArrayList <Integer> arr1 = new ArrayList<Integer>(); // generic
        arr1.add(100);
        //arr1.add("selenium");

        ArrayList<String> str = new ArrayList<String>();
        str.add("selenium");

      //  ArrayList<E>  arr3= new ArrayList<E>();

        //Employee class object
        Employee e1 = new Employee("Shilpa",30,"QA");
        Employee e2 = new Employee("TOM",27,"DEV");
        Employee e3 = new Employee("hARRY",31,"ADMIN");

        //CREATING ARRAYLIST
        ArrayList<Employee> arr4 = new ArrayList<Employee>();
        arr4.add(e1);
        arr4.add(e2);
        arr4.add(e3);
        // itreator to traverse the values
        Iterator<Employee> it = arr4.iterator();
        while(it.hasNext())
        {
             Employee emp = it.next();
             System.out.print(emp.name);
            System.out.print(emp.age);
            System.out.print(emp.dept);


        }
         System.out.println("*******************");
        // Addall() METHOD
        ArrayList<String> str1 = new ArrayList<String>();
        str1.add("selenium");
        str1.add("Test");
        str1.add("QTP");

        ArrayList<String> str2 = new ArrayList<String>();
        str2.add("TESTING");
        str2.add("ADMIN");
        str2.add("DEV");

        str1.addAll(str2);
        for(int i=0;i<str1.size();i++)
        {
            System.out.println(str1.get(i));

        }
        System.out.println("*******************");

        //rempoveall()
        str1.removeAll(str2);
        for(int i=0;i<str1.size();i++)
        {
            System.out.println(str1.get(i));

        }
        System.out.println("*******************");
        
        //retainall()
        ArrayList<String> str3 = new ArrayList<String>();
        str3.add("selenium");
        str3.add("Test");
        str3.add("QTP");

        ArrayList<String> str4 = new ArrayList<String>();
        str4.add("Test");
        str4.add("ADMIN");
        str3.retainAll(str4);
        for(int i=0;i<str3.size();i++)
        {
            System.out.println(str3.get(i));

        }


    }
}
 */
