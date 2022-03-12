package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class CopyConstructor
{
   private String name;
   private String course;

    public CopyConstructor(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public CopyConstructor() {
        this("parul","QA");  // calling constructor within constructor


    }

    public CopyConstructor(CopyConstructor cp)
    {
      this.name = cp.name;
      this.course = cp.course;

    }
/*
    public void displayData()
    {
        System.out.println("Name : "+this.name);
        System.out.println(("Course :"+this.course));

    }*/

    @Override
    public String toString() {
        return "CopyConstructor{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public static void main(String[] args)
    {

        CopyConstructor cp3 = new CopyConstructor();
        System.out.println("Calling constructor within constructor");
       // cp3.displayData();
        System.out.println(cp3);

        CopyConstructor cp1 = new CopyConstructor("Shilpa","JAVA");
        System.out.println(" content of the original object");
       // cp1.displayData();
        System.out.println(cp1);


        System.out.println("Contents of the copied object ");
        CopyConstructor cp2 = new CopyConstructor(cp1);
       // cp2.displayData();
        System.out.println(cp2);






    }



}
