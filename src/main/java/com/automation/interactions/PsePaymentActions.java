package com.automation.interactions;

import com.automation.models.PsePayment;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static com.automation.enums.EndPoints.*;

public class PsePaymentActions {

    public static Performable createWithInfo(PsePayment psePayment) {
        return Task.where("Create a pse payment",
                Post.to(CREATE_PSE_PAYMENT)
                        .with(requestSpecification ->
                                requestSpecification
                                        .body(psePayment)));

    }

    public static Performable getAllPsePayments() {
        return Task.where("Create a pse payment",
                Get.resource(GET_PSE_PAYMENTS));
    }

    public static Performable getAPsePayments(String idPsePayment) {
        return Task.where("Create a pse payment",
                Get.resource(PSE_PAYMENT_ID)
                        .with(requestSpecification ->
                                requestSpecification
                                        .pathParam("id", idPsePayment)));
    }

    public static Performable updateAPsePaymentWithInfo(String idPsePayment, PsePayment psePayment) {
        return Task.where("Create a pse payment",
                Put.to(PSE_PAYMENT_ID)
                        .with(requestSpecification ->
                                requestSpecification
                                        .body(psePayment)
                                        .pathParam("id", idPsePayment)));

    }

    public static Performable deleteAPsePayments(String idPsePayment) {
        return Task.where("Create a pse payment",
                Delete.from((PSE_PAYMENT_ID))
                        .with(requestSpecification ->
                                requestSpecification
                                        .pathParam("id", idPsePayment))
        );
    }
}
