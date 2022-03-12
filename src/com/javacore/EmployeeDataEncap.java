package com.javacore;

public class EmployeeDataEncap {
    //How to implement encapsulation
    // IS CALLED DATA HIDING
    //To Provide high level security in java we use encapsulation buz you can hide and restrict access to criticle data member
    //critical data varible in your class defined.it is not necessaary to define getter and setter method but if you really
    //want to access private data members then use getter and setter methods.
    // 1. Private data variable --so that these variables can not accessed directly from outside the class
    private int ssn;
    private String empName;
    private int age;

    public static void main(String[] args) {

        EmployeeDataEncap emp =new EmployeeDataEncap();
        emp.setEmpName("Shilpa");
        emp.setAge(30);
        emp.setSsn(123456);

        System.out.println("Employee name is :"+emp.getEmpName());
        System.out.println("Employee age is :"+emp.getAge());
        System.out.println("Employee SSN is :"+emp.getSsn());




    }




    // 2.getter and setter methods - to set and get the value of fields.
    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
