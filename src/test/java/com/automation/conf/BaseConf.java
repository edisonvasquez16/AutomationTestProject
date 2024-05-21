package com.automation.conf;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.model.util.EnvironmentVariables;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class BaseConf {

    protected Actor actor;
    private EnvironmentVariables environmentVariables;

    @BeforeEach
    public void setUp() {
        String serviceUrl = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("base.url");
        OnStage.setTheStage(Cast.whereEveryoneCan(CallAnApi.at(serviceUrl)));
        actor = theActorCalled("User payment");
        SerenityRest.setDefaultRequestSpecification(defaultRequestSpecification());

    }

    private RequestSpecification defaultRequestSpecification() {
        List<Filter> filters = new ArrayList<>();
        filters.add(new RequestLoggingFilter());
        filters.add(new ResponseLoggingFilter());
        return new RequestSpecBuilder().addFilters(filters).build();
    }
}
