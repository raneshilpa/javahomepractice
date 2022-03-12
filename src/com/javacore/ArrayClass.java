package com.javacore;

public class ArrayClass {
    public static void main(String[] args) {


        int arr[] = {10, 20, 30, 40, 50};
        //display arrary length
        System.out.println("Array length is "+arr.length);
        // display array
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"\t");

        //length of multidimentional array
        int multiArr[][]={{10,20},{30,40},{50,60}};

        //display length
        System.out.println("multidiamential arrary size "+multiArr.length);
        System.out.println("multiArr[0] length :"+multiArr[0].length);
        System.out.println("multiArr[1] length :"+multiArr[1].length);
        System.out.println("multiArr[2] length :"+multiArr[2].length);

        System.out.println("or using for loop");
        for(int i=0;i<multiArr.length;i++)
            System.out.println("multiArr["+i+"] length = "+multiArr[i].length);
        //print element of 2d array
        for(int i=0;i<multiArr.length;i++)
        {
            for(int j=0;j<multiArr[i].length;j++)
            {
                System.out.print(multiArr[i][j] +" ");
            }
            System.out.println();
        }

        //sum of array element
        int sum =0;
        for(int i=0;i<arr.length;i++)
            sum= sum+arr[i];
        System.out.println("Sum of array element :"+sum);


    }
}
