package com.company;

import java.util.Arrays;

public class StringClass {



    public static void main(String[] args) {

        String[] names = new String[10];
        names[0]= "Shilpa";
        names[1]= "Neha";
        names[2]= "Parul";
        names[3]= "Vasu";
        names[4]= "Preety";
        names[5]= "Sneha";
        names[6]= "Preet";
        names[7]= "Shiva";
        names[8]= "Raja";
        names[9]= "Manpreet";


        //Sorting Array
        Arrays.sort(names);
        System.out.println("Sortrd Array is :");
        for (String st:names)
        {
            System.out.println(st);
        }
       // Entering value to be searched

        int index = Arrays.binarySearch(names, "Vasu");
        System.out.println("Index of search element is :"+index);
        //searching from index to to index
        System.out.println(Arrays.binarySearch(names, 1, 9, "Raja"));


        String[] s1=new String[]{"aaa","bbb","ccc","ddd"};
        String[] s2= new String[]{"aaa","bbb","ccc","ddd"};

        if(Arrays.equals(s1,s2))
            System.out.println("Both String array are equal");
        else
            System.out.println("both are not equal");


        System.out.println("Compare array");
        System.out.println(Arrays.compare(s1, s2));

        System.out.println("compare array fromindex to to index");
        System.out.println(Arrays.compare(s1, 1, 2, s2, 1, 2));

        System.out.println("Copy array from range");
        String[] str =Arrays.copyOfRange(names,2,6);
        System.out.println(Arrays.toString(str));


        System.out.println("Filling Array elements");
        int[] nums = new int[5];
        System.out.println(Arrays.toString(nums));
        Arrays.fill(nums,50);
        System.out.println(Arrays.toString(nums));


        //fill
        Arrays.fill(s1,1,3,"NNN");
        System.out.println("After filling NNN from index 1 to 2");
        for(String st1:s1)
            System.out.println(st1);


    }
}
