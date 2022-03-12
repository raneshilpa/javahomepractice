package com.javacore;

public class CompareArrayClass {

    public static void main(String[] args) {
        // declare and initialize arrays
        int arr1[]={10,20,30,40,50};
        int arr2[]=arr1;
        int arr3[]={10,20,30,40,50};
        int arr4[]={40,50,60,70,80};

        // compare arrays using == operator
        if(arr1==arr2)
            System.out.println("arr1 & arr2 both are same");
        else
            System.out.println("arr1 and arr2 both are not same");
        //compare arrays using arrays.equals() method
        if(arr1.equals(arr2))
        {
            System.out.println("arr1 and arr2 both are same using equals method");
        }
        else
            System.out.println("arr1 and arr2 both are not same using equals method");
        if(arr3.equals(arr4))
        {
            System.out.println("arr3 and arr4 both are same using equals method");
        }
        else
            System.out.println("arr3 and arr4 both are not same using equals method");

        //Limitation of Arrays.equals() method:- It can compare only one-dimensional arrays.
        // It can’t compare multidimensional arrays.
        //Arrays.deepEquals() method can compare only multidimensional array, not the single dimensional array.








    }
}
