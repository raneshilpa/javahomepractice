package com.collectionsPkg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HshMapConcept {


    public static void main(String[] args) {

   HashMap<Integer,String > hm = new HashMap<Integer, String >();
   hm.put(1,"Selenium");
   hm.put(2,"Java");
   hm.put(3,"Scala");
   hm.put(4,"SQL");
        System.out.println(hm.get(1));
        System.out.println(hm.get(5));//return null

        //iterarte hashmap

        for(Map.Entry m : hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //remove element
        System.out.println("Before removal :"+hm);
        hm.remove(3);
        System.out.println("After removal : "+hm);  // 3 is removed and hasmap does not maintain order

        HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
        Employee e1 = new Employee("Tom",20,"Admin");
        Employee e2 = new Employee("Harry",25,"QA");
        Employee e3 = new Employee("Rogger",3,"Dev");
        Employee e4 = new Employee("Petre",50,"Prod");

        emp.put(1,e1);
        emp.put(2,e2);
        emp.put(3,e3);
        emp.put(4,e4);

        //traverse the hasmap
        for(Entry<Integer,Employee> m:emp.entrySet())
        {
            Integer key = m.getKey();
            Employee value = m.getValue();

            System.out.println("Employee "+ key +"----info");
            System.out.println(value.name+" "+value.age+" "+value.dept);



        }







    }
}
