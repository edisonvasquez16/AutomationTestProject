package com.automation.models;

import lombok.Data;

@Data
public class CashPayment {

    private String cashreference;
    private String cashuserEmail;
    private Integer cashamount;
    private String cashcollectorCash;
    private String cashcellphone;

}
