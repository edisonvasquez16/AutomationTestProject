package com.automation.models;

import lombok.Data;

@Data
public class PsePayment {

    private String reference;
    private String referencePse;
    private String userEmail;
    private Integer amount;
    private String fullNameUser;
    private String cellphone;

}
