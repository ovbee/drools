package com.example.demo.model.fin;

import java.math.BigDecimal;

public class RewardCaseRebate extends Reward{
    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    private BigDecimal value;
}
