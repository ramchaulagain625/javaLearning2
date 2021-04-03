package com.class19;

public class taskTwo {
    /*
    Write a java program of Class Students that takes students name
    and 3 subject grades. Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks. Your program should
    print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */
    String name;
    int grade;
    int subject1;
    int subject2;
    int subject3;
    taskTwo(String name,int sub1,int sub2,int sub3){
        this.name=name;
        this.subject1=sub1;
        subject2=sub2;
        subject3=sub3;

    }
    void calculateGrade(){
        grade=(subject1+subject2+subject3)/3;
        System.out.println(grade);
    }

    public static void main(String[] args) {
        taskTwo obj=new taskTwo("Ram",90,86,94);
        obj.calculateGrade();
        System.out.println(obj.name);
        System.out.println("-------------------------from different classes-------------------------");
        hwOne obj2;
        obj2 = new hwOne();
        obj2.add();
    }
}
