package com.automation.factories;

import com.automation.models.CreditCardPayment;
import com.github.javafaker.Faker;

public class CreditCardFactory {

    private static final Faker jf = Faker.instance();

    public static CreditCardPayment withRandomData() {

        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.setCcreference(String.valueOf(jf.random().nextInt(10000,1000000)));
        creditCardPayment.setCcName(jf.name().fullName());
        creditCardPayment.setCcNumber(String.valueOf(jf.random().nextInt(1000000000000000,9999999999999999)));
        creditCardPayment.setCcMonthExp(jf.random().nextInt(1,12));
        creditCardPayment.setCcYearExp(jf.random().nextInt(23,50));
        creditCardPayment.setCcDues(String.valueOf(jf.random().nextInt(1,48)));
        creditCardPayment.setCclevel("VISA");
        creditCardPayment.setCcPayDate("2023-12-30");
        creditCardPayment.setCcSecurityCode(jf.random().nextInt(100,999));
        creditCardPayment.setCcuserEmail(jf.internet().emailAddress());
        creditCardPayment.setCcamount(String.valueOf(jf.random().nextInt(3000,800000)));
        creditCardPayment.setCccellphone(String.valueOf(jf.phoneNumber().cellPhone()));
        return creditCardPayment;

    }

}
