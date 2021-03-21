package com.class16;

public class splitDemo {
    public static void main(String[] args) {
        String var="Today is Wednesday";
        String[]strArr=var.split(" ");
        for(String word:strArr){
            System.out.println(word);
        }
        String var1="Syntax is the best .Batch 9 is great";
        String[] strArray=var1.split("[.]");
        for(int i=0;i<strArray.length;i++){
            System.out.println(strArray[i]);
        }
        //Method chaining spaces before Batch
        String var3="                      SYNTX           ";
        System.out.println(var3.trim().toLowerCase());
        String var2= "hi how are you?";
    }
}
