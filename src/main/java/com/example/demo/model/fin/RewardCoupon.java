package com.example.demo.model.fin;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RewardCoupon extends Reward{
    private String couponCd;
    private LocalDateTime fromDt;
    private LocalDateTime expiryDt;
    private String status;
    private BigDecimal value;

    public String getCouponCd() {
        return couponCd;
    }

    public void setCouponCd(String couponCd) {
        this.couponCd = couponCd;
    }

    public LocalDateTime getFromDt() {
        return fromDt;
    }

    public void setFromDt(LocalDateTime fromDt) {
        this.fromDt = fromDt;
    }

    public LocalDateTime getExpiryDt() {
        return expiryDt;
    }

    public void setExpiryDt(LocalDateTime expiryDt) {
        this.expiryDt = expiryDt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
