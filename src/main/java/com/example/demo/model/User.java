package com.example.demo.model;

import com.example.demo.model.fact.KieFact;
import com.example.demo.model.fin.Account;
import com.example.demo.model.fin.enums.Cur;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String userName;
    private BigDecimal newFund;
    private Cur newFundCur;

    private List<KieFact> kieFacts;

    public BigDecimal getNewFund() {
        return newFund;
    }

    public void setNewFund(BigDecimal newFund) {
        this.newFund = newFund;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    private List<Account> accountList;

    public boolean containMCSSA(){
        if(accountList != null){
            return accountList.stream().anyMatch(x->"MCSSA".equals(x.getType()));
        }
        return false;
    }

    public List<KieFact> getUserFacts() {
        return kieFacts;
    }

    public void setUserFacts(List<KieFact> kieFacts) {
        this.kieFacts = kieFacts;
    }
    public void addUserFact(KieFact kieFact){
        if(kieFacts == null){
            kieFacts = new ArrayList<>();
        }
        this.kieFacts.add(kieFact);
    }
    public Cur getNewFundCur() {
        return newFundCur;
    }

    public void setNewFundCur(Cur newFundCur) {
        this.newFundCur = newFundCur;
    }
}
