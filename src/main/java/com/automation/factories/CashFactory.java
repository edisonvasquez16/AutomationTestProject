package com.automation.factories;

import com.automation.models.CashPayment;
import com.github.javafaker.Faker;

import static com.automation.enums.Constants.COLLECTORS_CASH;

public class CashFactory {

    private static final Faker jf = Faker.instance();

    public static CashPayment withRandomData() {

        CashPayment cashPayment = new CashPayment();
        cashPayment.setReference(String.valueOf(jf.random().hashCode()));
        cashPayment.setUserEmail(jf.internet().emailAddress());
        cashPayment.setAmount(jf.random().nextInt(3000, 800000));
        cashPayment.setCollectorCash(COLLECTORS_CASH[jf.random().nextInt(0, 4)]);
        cashPayment.setCellphone(jf.phoneNumber().cellPhone());
        return cashPayment;

    }

}
