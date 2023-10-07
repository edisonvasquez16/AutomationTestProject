package com.automation.features;

import com.automation.consequences.SeeThatResponse;
import com.automation.tasks.CreateCashPayment;
import com.automation.conf.BaseConf;
import com.automation.factories.CashFactory;
import com.automation.interactions.CashPaymentActions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.automation.enums.Memory.CASH_PAYMENT_ID;

@ExtendWith(SerenityJUnit5Extension.class)
@Tag("cash")
public class CashTests extends BaseConf {

    @Test
    @Tag("smoke")
    public void seeTheCreateServiceResponseCorrectly_When_SubmitTheCorrectCashPaymentInformation() {

        actor.attemptsTo(
                CreateCashPayment
                        .withInfo(CashFactory
                                .withRandomData()));

    }

    @Test
    public void seeTheGetAllServiceResponseCorrectly_When_SubmitTheCorrectCashPaymentInformation() {

        actor.attemptsTo(
                CashPaymentActions
                        .getAllCashPayments());

        actor.should(
                SeeThatResponse.okStatus());

    }

    @Test
    public void seeTheGetServiceResponseCorrectly_When_SubmitTheCorrectCashPaymentInformation() {

        actor.wasAbleTo(
                CreateCashPayment
                        .withInfo(CashFactory
                                .withRandomData()));

        actor.attemptsTo(
                CashPaymentActions
                        .getACashPayment(actor.recall(CASH_PAYMENT_ID.name())));

        actor.should(
                SeeThatResponse.okStatus());

    }

    @Test
    public void seeTheUpdateServiceResponseCorrectly_When_SubmitTheCorrectCashPaymentInformation() {

        actor.wasAbleTo(
                CreateCashPayment
                        .withInfo(CashFactory
                                .withRandomData()));

        actor.attemptsTo(
                CashPaymentActions
                        .updateACashPaymentWithInfo(actor.recall(CASH_PAYMENT_ID.name()), CashFactory
                                .withRandomData()));

        actor.should(
                SeeThatResponse.createStatus());

    }

    @Test
    public void seeTheDeleteServiceResponseCorrectly_When_SubmitTheCorrectCashPaymentInformation() {

        actor.wasAbleTo(
                CreateCashPayment
                        .withInfo(CashFactory
                                .withRandomData()));

        actor.attemptsTo(
                CashPaymentActions
                        .deleteACashPayments(actor.recall(CASH_PAYMENT_ID.name())));

        actor.should(
                SeeThatResponse.createStatus());

    }

}
