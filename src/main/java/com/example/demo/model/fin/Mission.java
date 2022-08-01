package com.example.demo.model.fin;

import com.example.demo.model.BaseModel;

import com.example.demo.model.fin.enums.MissionStatus;

import java.time.LocalDateTime;
import java.util.List;

public class Mission extends BaseModel {
    private String missionCode;
    private LocalDateTime startDt;
    private LocalDateTime endDt;
    private MissionStatus status;

    private PromoCampaign promoCampaign;

    private List<Reward> rewardList;

    public PromoCampaign getCampaign() {
        return promoCampaign;
    }

    public void setCampaign(PromoCampaign promoCampaign) {
        this.promoCampaign = promoCampaign;
    }

    public String getMissionCode() {
        return missionCode;
    }

    public void setMissionCode(String missionCode) {
        this.missionCode = missionCode;
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

    public MissionStatus getStatus() {
        return status;
    }

    public void setStatus(MissionStatus status) {
        this.status = status;
    }


}
