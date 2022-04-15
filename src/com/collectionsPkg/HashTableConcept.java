package com.collectionsPkg;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

    public static void main(String[] args) {

        Hashtable h1 = new Hashtable();
        h1.put(1,"tom");
        h1.put(2,"Harry");
        h1.put(3,"Peter");


        //create clone copy
        Hashtable h2 = new Hashtable();
        h2=(Hashtable) h1.clone();

        System.out.println("Value from h1 :"+h1);
        System.out.println("Value from h2 :"+h2);

        h1.clear();
        System.out.println("Value from h1 :"+h1);
        System.out.println("Value from h2 :"+h2);

        Hashtable st = new Hashtable();
        st.put("A","JAVA");
        st.put("B","Selenium");
        st.put("C","QA");

        //contains value
        if(st.containsValue("QA"))
            System.out.println("value is present");

        //print all the values from hastable using enumeration element()
        Enumeration e = st.elements();
        System.out.println("Print values from st using enumeration ");

        while(e.hasMoreElements())
            System.out.println(e.nextElement());

        //print the values from hastable using entryset() -- set of hastable values
        System.out.println("Print values from st using entryset ");
        Set set = st.entrySet();
        System.out.println(set);

        Hashtable st1 = new Hashtable();
        st1.put("A","JAVA");
        st1.put("B","Selenium");
        st1.put("C","QA");

        //check both the hastable are equal or not st &st2
        if(st.equals(st1))
            System.out.println("Both are equal");

        //get the value of a key
        System.out.println(st1.get("A"));

        //GET THE HASHCODE OF hastable object
        System.out.println("Hascode value of st1 "+st1.hashCode());





    }
}
