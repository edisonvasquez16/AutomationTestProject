package com.automation.models;

import lombok.Data;

@Data
public class CreditCardPayment {

    private String ccreference;
    private String ccName;
    private String ccNumber;
    private String cclevel;
    private Integer ccMonthExp;
    private Integer ccYearExp;
    private Integer ccSecurityCode;
    private String ccuserEmail;
    private String ccDues;
    private String ccPayDate;
    private String ccamount;
    private String cccellphone;

}
