package com.lambda;

import java.util.List;

public class Student {

    private String stud_name;
    private int age;
    List<Integer> phone_nums;

    public Student(String stud_name, int age, List<Integer> phone_nums) {
        this.stud_name = stud_name;
        this.age = age;
        this.phone_nums = phone_nums;
    }

    public String getStud_name() {
        return stud_name;
    }

    public void setStud_name(String stud_name) {
        this.stud_name = stud_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Integer> getPhone_nums() {
        return phone_nums;
    }

    public void setPhone_nums(List<Integer> phone_nums) {
        this.phone_nums = phone_nums;
    }




}
