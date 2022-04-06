package com.collectionsPkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListClass {

    public static void main(String[] args) {

      //  Declaring the ArrayList
          ArrayList<String> list =new ArrayList();

        //Checking whether the list is empty
        System.out.println("Is ArrayList Empty: "+list.isEmpty());

        list.add("Ravi");
        list.add("Aman");
        list.add("Ajay");
        list.add("Meena");
        list.add("Teena");
        list.add("Ajay");
        list.add("Baban");
        list.add("Ravi");
        list.add("Parul");

        //Again checking for isEmpty
        System.out.println("Is ArrayList Empty: "+list.isEmpty());

        System.out.println("ArrayList is :"+list);
        System.out.println("Number of elements in ArrayList: "+list.size());

        System.out.println("Traversing list through Iterator");

        Iterator itr =list.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());


        System.out.println("Using enhanced for loop");
        for(String name :list)
            System.out.println("Name : "+name);


        System.out.println("For loop for iterating through collection");
          for (int i = 0; i < list.size(); i++)
            System.out.println("Name " + (i + 1) + ": " + list.get(i));

        //Change an element in ArrayList
        list.set(2,"Neha");
        System.out.println("index 2 changed"+list);

        //add(int index, element): It adds element to the array list at the given index.
        list.add(4,"Preet");
        System.out.println("Element Preet added to the 4th index :"+list);

        System.out.println("This would give the index (position) of the string Baban in the list  "+list.indexOf("Baban"));

        System.out.println("To get element at 3rd index : "+list.get(3));

        //the index of last Occurrence of element in the ArrayList.
        System.out.println("Last occurrence of Ravi in the ArrayList : "+list.lastIndexOf("Ravi"));

        System.out.println("To check whether specified element exists in the ArrayList:  "+list.contains("Teena"));

        //We use remove() method to remove elements from an ArrayList,
        list.remove(1);
        System.out.println("After removing 1st index item: ");
        System.out.println(list);

       //Sorting in Descending order
       // Collections.sort(list,Collections.reverseOrder());
       //  System.out.println(list);

       // sort Arraylist in ascending order
        Collections.sort(list);
        System.out.println("Sorted Array List in ascending order :     " +list);

        // sort ArrayList in descending order
        Collections.reverse(list);
        System.out.println("Sorted ArrayList in reverse order:    "+list);

        //sublist to arraylist
        ArrayList<String> newlist = new ArrayList(list.subList(2,4));
        System.out.println("Sublist stored in ArrayList:       "+newlist);

        //Example of swapping two elements in ArrayList
        System.out.println("ArrayList before swap :  "+list);

        //Swapping 2nd(index 1) element with the 5th(index 4) element
        System.out.println("ArrayList After swap  : ");
        Collections.swap(list,1,4);
        for(String str : list)
            System.out.println(str);

    }


}
