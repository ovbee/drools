package com.example.demo.model.fin;

import com.example.demo.model.BaseModel;

import java.math.BigDecimal;

public class Account extends BaseModel {
    private String acctNo;
    private String status;
    private String prodCode;
    private BigDecimal balance;
    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

}
