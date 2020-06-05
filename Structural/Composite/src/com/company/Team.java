package com.company;

import java.util.ArrayList;

public class Team  {
    private double a,b;

    public Team(double a, double b) {
        this.a = a;
        this.b = b;
    }

    private ArrayList<ArithmeticExpression> arithmeticExpressions = new ArrayList<ArithmeticExpression>();

    public void addOperation(ArithmeticExpression arithmeticExpression){
        arithmeticExpressions.add(arithmeticExpression);
    }

    public void removeOperation(ArithmeticExpression arithmeticExpression){
        arithmeticExpressions.remove(arithmeticExpression);
    }

    public void createOperations(){
        System.out.println("Starts mathematics...\n");
        for (ArithmeticExpression arithmeticExpression: arithmeticExpressions){
            arithmeticExpression.operation(a,b);
        }
    }
}
