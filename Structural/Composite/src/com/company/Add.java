package com.company;

public class Add implements ArithmeticExpression {


    @Override
    public double operation(double a, double b) {
        System.out.println(a+b);
        return a + b;
    }
}
