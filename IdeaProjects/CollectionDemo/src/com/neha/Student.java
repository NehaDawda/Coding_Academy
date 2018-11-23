package com.neha;

public class Student implements Comparable<Student>{
    private int rollNo;
    private String fisrtNName;
    private String lastName;
    private int age;

    public Student(int rollNo, String fisrtNName, String lastName, int age) {
        this.rollNo = rollNo;
        this.fisrtNName = fisrtNName;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString(){
        return rollNo +" Name: "+fisrtNName+ " "+lastName+" age: "+age;
    }

    public int compareTo(Student obj){
        System.out.println("in CompareTo method");
        return this.rollNo - obj.rollNo;

    }
}
