package com.javacore;

import java.util.HashSet;
import java.util.Set;

public class DupArrayElementClass {

    public static void main(String[] args) {

        String str[] ={"JAVA","Selenium","JAVA","VB","SQL","Selenium","SQL"};
        System.out.println("......brute force--------");
        System.out.println("Shilpa Code");
        for(int i=0;i<str.length;i++)
        {
            for(int j=i+1;j<str.length;j++)
            {
                if(str[i].equals(str[j]))
                {
                    System.out.println(str[i]);
                }
            }
        }

        System.out.println("............USING HASHSET.......");
        Set<String> data=  new HashSet<String>();
        for(String e: str )
        {
            if(data.add(e)== false)
                System.out.println(e);
        }

    }
}
