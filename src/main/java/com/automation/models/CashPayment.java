package com.automation.models;

import lombok.Data;

@Data
public class CashPayment {

    private String reference;
    private String userEmail;
    private Integer amount;
    private String collectorCash;
    private String cellphone;

}
