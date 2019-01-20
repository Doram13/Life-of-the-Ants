package com.Doram;

import java.util.ArrayList;
import java.util.List;

public class Drone extends Colony {
    private int id;
    private int[] position;
    private int stepsFromQueen;
    private int[] distanceFromQueen = new int[2];
    private int stepCounter;
    private int mateCounter;
    static List<Drone> drones = new ArrayList<Drone>();

    public Drone() {
        this.id = createId();
        this.position = randomPosition();
        this.stepCounter = 0;
        this.mateCounter = 0;
        drones.add(this);
    }

    @Override
    public void step() {
        this.distanceFromQueen = queenDistance(position);
        this.stepsFromQueen = distanceFromQueen[0] + distanceFromQueen[1];
        if (stepsFromQueen > 3) {
            this.moveToQueen();
        }
        if (stepsFromQueen <= 3) {
            if (matingMood) {
                this.mate();
            }
            if (mateCounter > 0 && mateCounter < 10) {
                this.mate();
            }
            else {
                this.kickedOut();
            }
        }
    }

    private void mate() {
        System.out.println("HALLELUJAH");
        this.mateCounter++;
    }

    private void kickedOut() {
        this.position[0] += 50;
        this.position[1] += 50;
        System.out.println("D'OH");
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
            case 1:
                if(this.position[1] < 0) {
                    this.position[1]++;
                }
                if (this.position[1] > 0) {
                    this.position[1]--;
                }
        }
    }
}

