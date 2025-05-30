package com.transaction.dto;

import java.math.BigDecimal;

public class TransferRequestDTO {
    private String sourceAccountId;
    private String destinationAccountId;
    private String sourceBankId;
    private String destinationBankId;
    private BigDecimal amount;


    public String getSourceAccountId() {
        return sourceAccountId;
    }

    public void setSourceAccountId(String sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    public String getDestinationAccountId() {
        return destinationAccountId;
    }

    public void setDestinationAccountId(String destinationAccountId) {
        this.destinationAccountId = destinationAccountId;
    }

    public String getSourceBankId() {
        return sourceBankId;
    }

    public void setSourceBankId(String sourceBankId) {
        this.sourceBankId = sourceBankId;
    }

    public String getDestinationBankId() {
        return destinationBankId;
    }

}