package com.automation.tasks;

import com.automation.consequences.SeeThatResponse;
import com.automation.interactions.CreditCardPaymentActions;
import com.automation.models.CreditCardPayment;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

import static com.automation.enums.Memory.CC_PAYMENT_ID;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateCreditCardPayment implements Task {

    private final CreditCardPayment creditCardPayment;

    public CreateCreditCardPayment(CreditCardPayment creditCardPayment) {
        this.creditCardPayment = creditCardPayment;
    }

    public static CreateCreditCardPayment withInfo(CreditCardPayment cashPayment) {
        return instrumented(CreateCreditCardPayment.class, cashPayment);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CreditCardPaymentActions
                        .createWithInfo(creditCardPayment)
        );

        actor.should(
                SeeThatResponse.createStatus()
        );

        actor.remember(CC_PAYMENT_ID.name(), LastResponse.received().answeredBy(actor)
                .body().jsonPath().getString("_id"));

    }
}
