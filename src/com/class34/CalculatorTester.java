package com.class34;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            calculator.calculate();
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }
        catch (NullPointerException e){
            System.out.println("can not be null ");
        }
    }
}
