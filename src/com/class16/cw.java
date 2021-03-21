package com.class16;

public class cw {
    public static void main(String[] args) {
        String var="Hi i want lo learn java";
        System.out.println(var.replace(" ",""));
        System.out.println("_______________two_____________________________");
        String var1="@#$$%%%!12344567asedfrgvrbnh";
        String str =var1.replaceAll("[0-9a-zA-Z]","");
        int count = 0,count1=0;
        for(int i=0;i<str.length();i++){
            count++;
        }
        System.out.println(count);
        System.out.println("_______________Three_____________________________");
String a="Is it saturday? Is it raining? Do we have a Java Class today?";
String[] b=a.split("[?]");
for (String c:b){
    count1++;
}
        System.out.println(count1);
    }
}
