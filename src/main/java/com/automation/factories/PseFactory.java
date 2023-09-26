package com.automation.factories;

import com.automation.models.CashPayment;
import com.automation.models.PsePayment;
import com.github.javafaker.Faker;

import static com.automation.enums.Constants.COLLECTORS_CASH;

public class PseFactory {

    private static final Faker jf = Faker.instance();

    public static PsePayment withRandomData() {

        PsePayment psePayment = new PsePayment();
        psePayment.setReference(String.valueOf(jf.random().hashCode()));
        psePayment.setReferencePse(String.valueOf(jf.random().hashCode()));
        psePayment.setUserEmail(jf.internet().emailAddress());
        psePayment.setAmount(jf.random().nextInt(3000, 800000));
        psePayment.setFullNameUser(jf.name().fullName());
        psePayment.setCellphone(jf.phoneNumber().cellPhone());
        return psePayment;

    }

}
