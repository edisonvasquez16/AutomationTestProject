package com.automation.enums;

public class EndPoints {

    //PSE
    public static final String CREATE_PSE_PAYMENT = "/api/v1/pse-payment";
    public static final String GET_PSE_PAYMENTS = "/api/v1/pse-payments";
    public static final String PSE_PAYMENT_ID = "/api/v1/pse-payment/{id}";
    
    //Credit card
    public static final String CREATE_CC_PAYMENT = "/api/v1/credit-card-payment";
    public static final String GET_CC_PAYMENTS = "/api/v1/credit-card-payments";
    public static final String CC_PAYMENT_ID = "/api/v1/credit-card-payment/{id}";

    //Cash
    public static final String CREATE_CASH_PAYMENT = "/api/v1/cash-payment";
    public static final String GET_CASH_PAYMENTS = "/api/v1/cash-payments";
    public static final String CASH_PAYMENT_ID = "/api/v1/cash-payment/{id}";


}
