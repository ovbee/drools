package com.example.demo.model.fact;


public class AddressCheckResult {

    private boolean postCodeResult = false; // true:通过校验；false：未通过校验
    private boolean countryResult = false; 
    public boolean isPostCodeResult() {
        return postCodeResult;
    }

    public void setPostCodeResult(boolean postCodeResult) {
        this.postCodeResult = postCodeResult;
    }
    public boolean isCountryResult() {
    	return countryResult;
    }
    public void setCountryResult(boolean countryResult) {
    	this.countryResult = countryResult;
    }
}
