package com.example.demo.model.fin;

public class RewardLuckyDraw extends Reward{
    public Reward getReward() {
        return reward;
    }

    public void setReward(Reward reward) {
        this.reward = reward;
    }

    private Reward reward;
}
