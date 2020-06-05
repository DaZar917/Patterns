package com.company;

public class Mathematics {
    public static void main(String[] args) {

        double a = 8, b = 2;

        Team team = new Team(a,b);



        ArithmeticExpression mull = new Mull();
        ArithmeticExpression add = new Add();
        ArithmeticExpression sub = new Sub();
        ArithmeticExpression div = new Div();

        team.addOperation(mull);
        team.addOperation(add);
        team.addOperation(sub);
        team.addOperation(div);

        team.createOperations();

        System.out.println("\n\n===================new");
        team.removeOperation(mull);
        team.removeOperation(add);
        team.createOperations();

    }
}
