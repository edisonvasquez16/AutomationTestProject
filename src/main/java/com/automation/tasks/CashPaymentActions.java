package com.automation.tasks;

import com.automation.models.CashPayment;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static com.automation.enums.EndPoints.*;

public class CashPaymentActions {

    public static Performable createWithInfo(CashPayment cashPayment) {
        return Task.where("Create a cash payment",
                Post.to(CREATE_CASH_PAYMENT)
                        .with(requestSpecification ->
                                requestSpecification
                                        .body(cashPayment)));

    }

    public static Performable getAllCashPayments() {
        return Task.where("Create a cash payment",
                Get.resource(GET_CASH_PAYMENTS));
    }

    public static Performable getACashPayments(String idCashPayment) {
        return Task.where("Create a cash payment",
                Get.resource(CASH_PAYMENT_ID)
                        .with(requestSpecification ->
                                requestSpecification
                                        .pathParam("id", idCashPayment)));
    }

    public static Performable updateACashPaymentWithInfo(String idCashPayment, CashPayment cashPayment) {
        return Task.where("Create a cash payment",
                Put.to(CASH_PAYMENT_ID)
                        .with(requestSpecification ->
                                requestSpecification
                                        .body(cashPayment)
                                        .pathParam("id", idCashPayment)));

    }

    public static Performable deleteACashPayments(String idCashPayment) {
        return Task.where("Create a cash payment",
                Delete.from((CASH_PAYMENT_ID))
                        .with(requestSpecification ->
                                requestSpecification
                                        .pathParam("id", idCashPayment))
        );
    }
}
