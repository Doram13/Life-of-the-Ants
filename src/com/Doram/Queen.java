package com.Doram;

import java.util.Random;

public class Queen extends Colony{
    int[] queenPosition = new int[2];

    int lastTimeMated;

    public void Queen() {
        matingMood = false;
        queenPosition[0] = 0;
        queenPosition[1] = 0;
        lastTimeMated = 0;
        System.out.println("Queen's position: " + queenPosition[0]);
        System.out.println(queenPosition[1]);
    }

    public Queen getInstance() {
        return this;
    }

    private void setMatingMood() {
        Random r = new Random();
        if (lastTimeMated > 10 && r.nextDouble() <= 0.33) {
            matingMood = true;
            lastTimeMated = 0;
        }
    }

    @Override
    public void step()  {
        if (matingMood) {
            matingMood = false; }
        else {setMatingMood();}
        lastTimeMated++;

    }

}
