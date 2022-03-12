package com.javacore;

public class EmployeeClass
{
    int empid;
    String empName;
    String status;


    EmployeeClass()
    {
        status="Inactive";
        System.out.println("Default constructor called");
    }
//parameterized constructor with two parameters
    EmployeeClass(int empid,String empName)
    {
        this.empid=empid;
        this.empName=empName;

    }

    //Java Copy Constructor
    //A copy constructor is used for copying the values of one object to another object.

    EmployeeClass(EmployeeClass empclass)
    {
        this.empid = empclass.empid;
        this.empName= empclass.empName;
    }
    void info()
    {
        System.out.println("Emp Id : "+empid + " Emp Name :" + empName);
    }
    void deafultInfo()
    {
        System.out.println("Status is  "+status);
    }

    public static void main(String[] args) {
        EmployeeClass emp = new EmployeeClass(10001,"shilpa");
        EmployeeClass emp1 = new EmployeeClass(10002,"Parul");
        EmployeeClass emp4 = new EmployeeClass(emp1);

        EmployeeClass emp2 = new EmployeeClass();
        emp4.info();

        emp.info();
        emp1.info();
        emp2.deafultInfo();
        System.out.println("feature1");
        System.out.println("some function added");

    }
}
