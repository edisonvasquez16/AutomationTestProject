package com.automation.factories;

import com.automation.models.CashPayment;
import com.automation.models.CreditCardPayment;
import com.github.javafaker.Faker;

import static com.automation.enums.Constants.COLLECTORS_CASH;

public class CreditCardFactory {

    private static final Faker jf = Faker.instance();

    public static CreditCardPayment withRandomData() {

        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.setReference(String.valueOf(jf.random().hashCode()));
        creditCardPayment.setCcName(jf.name().fullName());
        creditCardPayment.setCcNumber(jf.finance().creditCard());
        creditCardPayment.setCcMonthExp(jf.random().nextInt(1,12));
        creditCardPayment.setCcYearExp(jf.random().nextInt(23,50));
        creditCardPayment.setCcSecurityCode(jf.random().nextInt(100,999));
        creditCardPayment.setUserEmail(jf.internet().emailAddress());
        creditCardPayment.setAmount(jf.random().nextInt(3000,800000));
        creditCardPayment.setCellphone(jf.phoneNumber().cellPhone());
        return creditCardPayment;

    }

}
