package com.automation.consequences;

import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.apache.http.HttpStatus.SC_CREATED;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.CoreMatchers.equalTo;

public class SeeThatResponse {

    public static Consequence okStatus() {
        return seeThat("See that the ok response", response ->
                        LastResponse.received().answeredBy(theActorInTheSpotlight()).statusCode(),
                equalTo(SC_OK));
    }

    public static Consequence createStatus() {
        return seeThat("See that the ok response", response ->
                        LastResponse.received().answeredBy(theActorInTheSpotlight()).statusCode(),
                equalTo(SC_CREATED));
    }

}
