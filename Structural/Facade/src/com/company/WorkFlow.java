package com.company;

import com.company.types.Billing;

public class WorkFlow {
    Operator operator = new Operator();
    Shipping shipping = new Shipping();
    OrderFullfillment orderFullfillment = new OrderFullfillment();
    Billing billing = new Billing();

    public void manage(){
        System.out.println("Manage a project...");

        operator.doJob(orderFullfillment,billing,shipping);

    }
}
