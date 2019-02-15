package com.Doram;

import java.util.ArrayList;
import java.util.List;

public class Drone extends Ant {
    private int id;
    private int[] position;
    private int stepsFromQueen;
    private int[] distanceFromQueen = new int[2];
    private int stepCounter;
    private int mateCounter;
    private Queen queen;

    public Drone() {
        id = createId();
        position = randomPosition();
        stepCounter = 0;
        mateCounter = 0;
    }

    public void setQueen(Queen queen) {
        this.queen = queen;
    }

    @Override
    public void step() {
        distanceFromQueen = queenDistance(position);
            stepsFromQueen = distanceFromQueen[0] + distanceFromQueen[1];
            if (stepsFromQueen > 3) {
                this.moveToQueen();
            }
            if (stepsFromQueen <= 3) {
                if (queen.getMatingMood() && mateCounter == 0) {
                    this.mate();
                }
                if (mateCounter > 0 && mateCounter < 10) {
                    this.mateContinue();
                }
                else {
            this.kickedOut();
        }
    }
    }

    private void mateContinue() {
        this.mateCounter++;
    }

    private void mate() {
        System.out.println("HALLELUJAH");
        this.mateCounter++;
        this.queen.mate();
    }

    private void kickedOut() {
        this.position[0] += 50;
        this.position[1] += 50;
        if (mateCounter == 0) {
            System.out.println("D'OH");}
        this.mateCounter = 0;
    }





    private void moveToQueen() {
        switch (this.stepCounter%2) {
            case 0:
                if (this.position[0] < 0) {
                    this.position[0]++;}
                if (this.position[0] > 0) {
                    this.position[0]--;
                    }
                break;
            case 1:
                if(this.position[1] < 0) {
                    this.position[1]++;
                }
                if (this.position[1] > 0) {
                    this.position[1]--;
                }
                break;
            default: break;
        }
        stepCounter++;
    }
}

