package com.automation.features;

import com.automation.conf.BaseConf;
import com.automation.consequences.SeeThatResponse;
import com.automation.factories.CreditCardFactory;
import com.automation.interactions.CreditCardPaymentActions;
import com.automation.tasks.CreateCreditCardPayment;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.automation.enums.Memory.CC_PAYMENT_ID;

@ExtendWith(SerenityJUnit5Extension.class)
@Tag("credit-card")
public class CreditCardTests extends BaseConf {

    @Test
    @Tag("smoke")
    public void seeTheCreateServiceResponseCorrectly_When_SubmitTheCorrectCreditCardPaymentInformation(){

        actor.attemptsTo(
                CreateCreditCardPayment
                        .withInfo(CreditCardFactory.withRandomData()));

    }

    @Test
    public void seeTheGetAllServiceResponseCorrectly_When_SubmitTheCorrectCreditCardPaymentInformation(){

        actor.attemptsTo(
                CreditCardPaymentActions
                        .getAllCreditCardPayments()
        );

        actor.should(
                SeeThatResponse.okStatus());

    }

    @Test
    public void seeTheGetServiceResponseCorrectly_When_SubmitTheCorrectCreditCardPaymentInformation(){

        actor.wasAbleTo(
                CreateCreditCardPayment
                        .withInfo(CreditCardFactory.withRandomData())
        );

        actor.attemptsTo(
                CreditCardPaymentActions
                        .getACreditCardPayment(actor.recall(CC_PAYMENT_ID.name())));

        actor.should(
                SeeThatResponse.okStatus());

    }

    @Test
    public void seeTheUpdateServiceResponseCorrectly_When_SubmitTheCorrectCreditCardPaymentInformation(){

        actor.wasAbleTo(
                CreateCreditCardPayment
                        .withInfo(CreditCardFactory.withRandomData()));

        actor.attemptsTo(
                CreditCardPaymentActions
                        .updateACreditCardPaymentWithInfo(actor.recall(CC_PAYMENT_ID.name()),
                                CreditCardFactory.withRandomData()));

        actor.should(
                SeeThatResponse.createStatus());

    }
    
    @Test
    public void seeTheDeleteServiceResponseCorrectly_When_SubmitTheCorrectCreditCardPaymentInformation(){

        actor.wasAbleTo(
                CreateCreditCardPayment
                        .withInfo(CreditCardFactory.withRandomData()));

        actor.attemptsTo(
                CreditCardPaymentActions
                        .deleteACreditCardPayment(actor.recall(CC_PAYMENT_ID.name())));

        actor.should(
                SeeThatResponse.createStatus());

    }

}
