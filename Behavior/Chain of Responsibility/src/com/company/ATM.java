package com.company;

public class ATM {
    public static void main(String[] args) {
        Money hundred = new Hundred(Value.HUNDRED);
        Money fifty = new Fifty(Value.FIFTY);
        Money twenty = new Twenty(Value.TWENTY);

        hundred.setNextMoney(fifty);
        fifty.setNextMoney(twenty);

        System.out.println("===========");

        hundred.giveMoney(" 100 eur ",Value.HUNDRED.getValue());
        System.out.println("===========");
        hundred.giveMoney(" 50 eur ", Value.FIFTY.getValue());
        System.out.println("===========");
        hundred.giveMoney(" 20 eur ", Value.TWENTY.getValue());
        System.out.println("===========");
    }
}
