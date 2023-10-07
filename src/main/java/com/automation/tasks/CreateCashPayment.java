package com.automation.tasks;

import com.automation.consequences.SeeThatResponse;
import com.automation.interactions.CashPaymentActions;
import com.automation.models.CashPayment;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

import static com.automation.enums.Memory.CASH_PAYMENT_ID;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateCashPayment implements Task {

    private final CashPayment cashPayment;

    public CreateCashPayment(CashPayment cashPayment){
        this.cashPayment = cashPayment;
    }

    public static CreateCashPayment withInfo(CashPayment cashPayment) {
        return instrumented(CreateCashPayment.class, cashPayment);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CashPaymentActions
                        .createWithInfo(cashPayment)
        );

        actor.should(
                SeeThatResponse.createStatus()
        );

        actor.remember(CASH_PAYMENT_ID.name(), LastResponse.received().answeredBy(actor)
                .body().jsonPath().getString("_id"));

    }
}
