package com.automation.factories;

import com.automation.models.CashPayment;
import com.github.javafaker.Faker;

import static com.automation.enums.Constants.COLLECTORS_CASH;

public class CashFactory {

    public static CashPayment withRandomData() {

        CashPayment cashPayment = new CashPayment();
        Faker jf = Faker.instance();
        cashPayment.setCashreference(String.valueOf(jf.random().hashCode()));
        cashPayment.setCashuserEmail(jf.internet().emailAddress());
        cashPayment.setCashamount(jf.random().nextInt(3000, 800000));
        cashPayment.setCashcollectorCash(COLLECTORS_CASH[jf.random().nextInt(0, 4)]);
        cashPayment.setCashcellphone(jf.phoneNumber().cellPhone());
        return cashPayment;

    }

}
