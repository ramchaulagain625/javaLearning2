package com.Class30;

import java.util.ArrayList;

public class StudentTester {


    public static void main(String[] args) {
        ArrayList<Student> students= new ArrayList<>();
        students.add(new Student(1,"Ram",26));
        students.add(new Student(2,"Yovana",28));
        students.add(new Student(3,"Anusha",36));
        students.add(new Student(4,"egune",15));
        students.add(new Student(5,"mirage",85));
        students.add(new Student(6,"Arina",58));
        students.add(new Student(7,"Anisthisa",56));
        students.add(new Student(8,"Salma",27));

        Student s=new Student(6,"Arina",58);
        students.remove(s);
        System.out.println(students);


    }
}
