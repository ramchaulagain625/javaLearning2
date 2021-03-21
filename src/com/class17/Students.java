package com.class17;

public class Students {
    String studentName , studentID;
    static int numberOfStudents;

    public static void main(String[] args) {

        Students obj1=new Students();
        obj1.studentName="Anusha";
        obj1.studentID="S390";
        numberOfStudents++;

        Students obj2=new Students();
        obj2.studentName="Ram";
        obj2.studentID="S345";
        numberOfStudents++;

        Students obj3=new Students();
        obj3.studentName="Asghar";
        obj3.studentID="S413";
        numberOfStudents++;


        System.out.println(numberOfStudents);
    }

}
