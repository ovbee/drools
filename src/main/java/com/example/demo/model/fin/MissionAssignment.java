package com.example.demo.model.fin;

import com.example.demo.model.BaseModel;
import com.example.demo.model.User;
import com.example.demo.model.fin.enums.MissionAssignStatus;

import java.time.LocalDateTime;

public class MissionAssignment extends BaseModel {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public LocalDateTime getAssignDt() {
        return assignDt;
    }

    public void setAssignDt(LocalDateTime assignDt) {
        this.assignDt = assignDt;
    }

    public MissionAssignStatus getStatus() {
        return status;
    }

    public void setStatus(MissionAssignStatus status) {
        this.status = status;
    }

    private Mission mission;
    private LocalDateTime assignDt;
    private MissionAssignStatus status;
}
