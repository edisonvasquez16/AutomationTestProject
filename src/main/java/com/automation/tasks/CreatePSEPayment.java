package com.automation.tasks;

import com.automation.consequences.SeeThatResponse;
import com.automation.interactions.PsePaymentActions;
import com.automation.models.PsePayment;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

import static com.automation.enums.Memory.PSE_PAYMENT_ID;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreatePSEPayment implements Task {

    private final PsePayment psePayment;

    public CreatePSEPayment(PsePayment psePayment){
        this.psePayment = psePayment;
    }

    public static CreatePSEPayment withInfo(PsePayment cashPayment) {
        return instrumented(CreatePSEPayment.class, cashPayment);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                PsePaymentActions
                        .createWithInfo(psePayment)
        );

        actor.should(
                SeeThatResponse.okStatus()
        );

        actor.remember(PSE_PAYMENT_ID.name(), LastResponse.received().answeredBy(actor)
                .body().jsonPath().getString("_id"));

    }
}
