package com.company;

public class Mull implements ArithmeticExpression {



    @Override
    public double operation(double a, double b) {
        System.out.println(a*b);
        return a*b;
    }
}
