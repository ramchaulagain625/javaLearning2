package com.class14;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        int sum=calc.add(20,30);

        int sub=calc.sub(20,30);
        int multi= calc.multi(20,30);
        int div= calc.div(20,30);
        calc.isRaining(false);
        System.out.println("The addition of two number is "+sum);
        System.out.println("The subtraction of two number is "+sub);
        System.out.println("The multiplication of two number is "+multi);
        System.out.println("The division of two number is "+div);

    }
}
