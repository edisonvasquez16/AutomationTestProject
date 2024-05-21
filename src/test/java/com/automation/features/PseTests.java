package com.automation.features;

import com.automation.conf.BaseConf;
import com.automation.consequences.SeeThatResponse;
import com.automation.factories.PseFactory;
import com.automation.interactions.PsePaymentActions;
import com.automation.tasks.CreatePSEPayment;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.automation.enums.Memory.PSE_PAYMENT_ID;

@ExtendWith(SerenityJUnit5Extension.class)
@Tag("staging")
@Tag("develop")
@Tag("PSE")
public class PseTests extends BaseConf {

    @Test
    @Tag("smoke")
    public void seeTheCreateServiceResponseCorrectly_When_SubmitTheCorrectPSEPaymentInformation() {

        actor.attemptsTo(
                CreatePSEPayment
                        .withInfo(PseFactory
                                .withRandomData()));

    }

    @Test
    public void seeTheGetAllServiceResponseCorrectly_When_SubmitTheCorrectPSEPaymentInformation() {

        actor.attemptsTo(
                PsePaymentActions
                        .getAllPsePayments());

        actor.should(
                SeeThatResponse.okStatus());

    }

    @Test
    public void seeTheGetServiceResponseCorrectly_When_SubmitTheCorrectPSEPaymentInformation() {

        actor.wasAbleTo(
                CreatePSEPayment
                        .withInfo(PseFactory
                                .withRandomData()));

        actor.attemptsTo(
                PsePaymentActions
                        .getAPsePayments(actor.recall(PSE_PAYMENT_ID.name())));

        actor.should(
                SeeThatResponse.okStatus());

    }

    @Test
    public void seeTheUpdateServiceResponseCorrectly_When_SubmitTheCorrectPSEPaymentInformation() {

        actor.wasAbleTo(
                CreatePSEPayment
                        .withInfo(PseFactory
                                .withRandomData()));

        actor.attemptsTo(
                PsePaymentActions
                        .updateAPsePaymentWithInfo(actor.recall(PSE_PAYMENT_ID.name()),
                                PseFactory.withRandomData()));

        actor.should(
                SeeThatResponse.createStatus());

    }

    @Test
    public void seeTheDeleteServiceResponseCorrectly_When_SubmitTheCorrectPSEPaymentInformation() {

        actor.wasAbleTo(
                CreatePSEPayment
                        .withInfo(PseFactory
                                .withRandomData()));

        actor.attemptsTo(
                PsePaymentActions
                        .deleteAPsePayments(actor.recall(PSE_PAYMENT_ID.name())));

        actor.should(
                SeeThatResponse.createStatus());

    }

}
