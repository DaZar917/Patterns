package com.company;

import com.company.types.Billing;

public class Operator {
    public void doJob(OrderFullfillment orderFullfillment, Billing billing, Shipping shipping){
        System.out.println("Operations begin...\n=======================");
        orderFullfillment.toggle();
        billing.toggle();
        shipping.toggle();


        if (orderFullfillment.isActiveOrder())
            orderFullfillment.startOrder();

        if (billing.isActiveBilling())
            billing.startBilling();

        if (shipping.isActiveShipping())
            shipping.startShipping();

        System.out.println("=======================");
    }
}
