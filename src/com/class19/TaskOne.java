package com.class19;

public class TaskOne {
    String name;
    int salary;
    TaskOne(){
        salary=290870;
        name="Ram";

    }
    TaskOne(String name,int imployee_id){
        this.name="Rammani";
        imployee_id=123;
    }

    public static void main(String[] args) {
        TaskOne obj=new TaskOne();
        System.out.println(obj.name);
        System.out.println(obj.salary);
        TaskOne obj2=new TaskOne("sabita" ,456);
        System.out.println(obj2.name);
    }
}
