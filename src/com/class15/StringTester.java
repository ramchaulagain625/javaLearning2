package com.class15;

public class StringTester {
    public static void main(String[] args) {
        StringWxample1 ramObj=new StringWxample1();
        ramObj.name="Ram";
        ramObj.age=25;
        ramObj.studentId="CS123";
        ramObj.schoolName="Syntax";
        ramObj.study();
        ramObj.payTuition();
System.out.println();
        StringWxample1 aimenObj=new StringWxample1();
        aimenObj.name="Aimen";
        aimenObj.age=30;
        aimenObj.studentId="SC456";
        aimenObj.schoolName="Syntax";
        aimenObj.study();
        aimenObj.payTuition();

    }
}
