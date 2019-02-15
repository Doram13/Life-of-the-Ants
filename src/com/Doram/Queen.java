package com.Doram;

import java.util.Random;

public class Queen extends Ant {
    private int[] queenPosition = new int[2];
    private boolean matingMood;

    private int lastTimeMated;

    public Queen() {
        this.queenPosition[0] = 0;
        this.queenPosition[1] = 0;
        this.lastTimeMated = 0;

        System.out.println("Queen's position: " + queenPosition[0]);
        System.out.println(queenPosition[1]);
    }

    public int[] getQueenPosition() {
        return queenPosition;
    }

    private void setMatingMood() {
        Random r = new Random();
        if (lastTimeMated > 50 && r.nextDouble() <= 0.10) {
            this.matingMood = true;
            this.lastTimeMated = 0;
        }
    }

    @Override
    public void step()  {
        setMatingMood();
        this.lastTimeMated++;
    }

    public boolean getMatingMood() {
        return matingMood;
    }

    protected void mate() {
        matingMood = false;
    }
}
