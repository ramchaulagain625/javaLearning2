package com.class21.demo;

public class childClass extends parent{
    public childClass(int num, int num1, String name) {
        super(num, num1, name);
    }
    int average(){
      return super.add()/2;
    }
}
