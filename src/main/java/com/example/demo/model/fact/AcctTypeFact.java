package com.example.demo.model.fact;

import com.example.demo.model.fin.enums.AcctType;

import java.util.ArrayList;
import java.util.List;

public class AcctTypeFact implements KieFact{
    @Override
    public boolean matchFact(KieFact destFact) {
        return true;
    }
    private List<AcctType> acctTypeList;

    public List<AcctType> getAcctTypeList() {
        return acctTypeList;
    }

    public void setAcctTypeList(List<AcctType> acctTypeList) {
        this.acctTypeList = acctTypeList;
    }
    public void addAcctType(AcctType acctType){
        if(acctTypeList == null){
            acctTypeList = new ArrayList<>();
        }
        acctTypeList.add(acctType);
    }
}
