package com.Doram;

import java.util.Random;

public class Queen extends Colony{
    int[] queenPosition = new int[2];

    int lastTimeMated;

    public void Queen() {
        this.queenPosition[0] = 0;
        this.queenPosition[1] = 0;
        this.lastTimeMated = 0;
        System.out.println("Queen's position: " + queenPosition[0]);
        System.out.println(queenPosition[1]);
    }

    public Queen getInstance() {
        return this;
    }

    private void setMatingMood() {
        Random r = new Random();
        if (lastTimeMated > 10 && r.nextDouble() <= 0.99) {
            matingMood = true;
           // this.lastTimeMated = 0;
        }
    }

    @Override
    public void step()  {
        setMatingMood();
        this.lastTimeMated++;


    }

}
