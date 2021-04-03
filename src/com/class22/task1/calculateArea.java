package com.class22.task1;

public class calculateArea {
    int areaOfRectangale(int length, int wide ){
        int area=Math.multiplyExact(length,wide);
        return area;
    }
    int areaOfSquare(int i){
        int area =Math.multiplyExact(i,i);
        return area;
    }
    int areaOfBox(int length,int wide,int height){
        int area=Math.multiplyExact(length,wide)*height;
        return area;
    }


    public static void main(String[] args) {
        calculateArea cal = new calculateArea();
        cal.areaOfRectangale(4,5);
        System.out.println(cal.areaOfRectangale(4,5));
        System.out.println(cal.areaOfSquare(5));
        System.out.println(cal.areaOfBox(10,3,4));
    }

}
