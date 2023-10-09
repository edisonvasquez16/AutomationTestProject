package com.automation.factories;

import com.automation.models.CashPayment;
import com.github.javafaker.Faker;

import static com.automation.enums.Constants.COLLECTORS_CASH;

public class CashFactory {

    private static final Faker jf = Faker.instance();

    public static CashPayment withRandomData() {

        CashPayment cashPayment = new CashPayment();
        cashPayment.setCashreference(String.valueOf(jf.random().nextInt(1000,1000000)));
        cashPayment.setCashuserEmail(jf.internet().emailAddress());
        cashPayment.setCashamount(jf.random().nextInt(3000, 800000));
        cashPayment.setCashcollectorCash(COLLECTORS_CASH[jf.random().nextInt(0, 4)]);
        cashPayment.setCashcellphone(jf.phoneNumber().cellPhone());
        return cashPayment;

    }

}
