package com.automation.models;

import lombok.Data;

@Data
public class CreditCardPayment {

    private String reference;
    private String ccName;
    private String ccNumber;
    private Integer ccMonthExp;
    private Integer ccYearExp;
    private Integer ccSecurityCode;
    private String userEmail;
    private Integer amount;
    private String cellphone;

}
