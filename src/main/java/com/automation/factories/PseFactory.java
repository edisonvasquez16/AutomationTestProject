package com.automation.factories;

import com.automation.models.PsePayment;
import com.github.javafaker.Faker;

public class PseFactory {

    private static final Faker jf = Faker.instance();

    public static PsePayment withRandomData() {

        PsePayment psePayment = new PsePayment();
        psePayment.setPsereference(String.valueOf(jf.random().nextInt(1000,1000000)));
        psePayment.setPsereferencePse(String.valueOf(jf.random().nextInt(1000,1000000)));
        psePayment.setPseuserEmail(jf.internet().emailAddress());
        psePayment.setPseamount(jf.random().nextInt(3000, 800000));
        psePayment.setPsefullNameUser(jf.name().fullName());
        psePayment.setPsecellphone(jf.phoneNumber().cellPhone());
        return psePayment;

    }

}
