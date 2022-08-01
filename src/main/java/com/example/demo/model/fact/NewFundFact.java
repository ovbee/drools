package com.example.demo.model.fact;

import com.example.demo.model.fin.enums.Cur;

import java.math.BigDecimal;

public class NewFundFact implements KieFact {
    private BigDecimal amount;
    private Cur cur;
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public Cur getCur() {
        return cur;
    }
    public void setCur(Cur cur) {
        this.cur = cur;
    }

    @Override
    public boolean matchFact(KieFact kieFact) {
        return this.amount.compareTo(((NewFundFact) kieFact).getAmount())>0 && this.cur.equals(((NewFundFact) kieFact).cur);
    }
}
