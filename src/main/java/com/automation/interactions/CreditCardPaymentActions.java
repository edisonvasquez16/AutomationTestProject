package com.automation.interactions;

import com.automation.models.CreditCardPayment;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static com.automation.enums.EndPoints.*;

public class CreditCardPaymentActions {

    public static Performable createWithInfo(CreditCardPayment ccPayment) {
        return Task.where("Create a credit card payment",
                Post.to(CREATE_CC_PAYMENT)
                        .with(requestSpecification ->
                                requestSpecification
                                        .body(ccPayment)));

    }

    public static Performable getAllCreditCardPayments() {
        return Task.where("Create a credit card payment",
                Get.resource(GET_CC_PAYMENTS));
    }

    public static Performable getACreditCardPayment(String idCcPayment) {
        return Task.where("Create a credit card payment",
                Get.resource(CC_PAYMENT_ID)
                        .with(requestSpecification ->
                                requestSpecification
                                        .pathParam("id", idCcPayment)));
    }

    public static Performable updateACreditCardPaymentWithInfo(String idCcPayment, CreditCardPayment ccPayment) {
        return Task.where("Create a credit card payment",
                Put.to(CC_PAYMENT_ID)
                        .with(requestSpecification ->
                                requestSpecification
                                        .body(ccPayment)
                                        .pathParam("id", idCcPayment)));

    }

    public static Performable deleteACreditCardPayment(String idCreditCardPayment) {
        return Task.where("Create a CreditCard payment",
                Delete.from((CC_PAYMENT_ID))
                        .with(requestSpecification ->
                                requestSpecification
                                        .pathParam("id", idCreditCardPayment))
        );
    }
}
