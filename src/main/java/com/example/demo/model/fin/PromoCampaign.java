package com.example.demo.model.fin;

import com.example.demo.model.BaseModel;
import com.example.demo.model.User;
import com.example.demo.model.fact.KieFact;
import com.example.demo.model.fin.enums.CampaignStatus;

import java.time.LocalDateTime;
import java.util.List;


public class PromoCampaign extends BaseModel {
    private String campaignCode;
    private LocalDateTime startDt;
    private LocalDateTime endDt;
    private CampaignStatus status;

    private List<KieFact> factList;

    public String getCampaignCode() {
        return campaignCode;
    }

    public void setCampaignCode(String campaignCode) {
        this.campaignCode = campaignCode;
    }

    public LocalDateTime getStartDt() {
        return startDt;
    }

    public void setStartDt(LocalDateTime startDt) {
        this.startDt = startDt;
    }

    public LocalDateTime getEndDt() {
        return endDt;
    }

    public void setEndDt(LocalDateTime endDt) {
        this.endDt = endDt;
    }

    public CampaignStatus getStatus() {
        return status;
    }

    public void setStatus(CampaignStatus status) {
        this.status = status;
    }

    public List<KieFact> getFactList() {
        return factList;
    }

    public void setFactList(List<KieFact> factList) {
        this.factList = factList;
    }

    public boolean allFactMatched(User user){
        if(factList != null){
           for(KieFact fact : factList){
               List<KieFact> kieFacts = user.getUserFacts();
               for(KieFact kieFact : kieFacts){
                   if(kieFact.matchFact(fact)){

                   }else{
                       return false;
                   }
               }
           }
        }
        return true;
    }
}
