package com.Doram;

public class Drone extends Colony {
    private int id;
    private int[] position;
    private int stepsFromQueen;
    private int[] distanceFromQueen = new int[2];
    private int stepCounter;
    private int mateCounter;

    public Drone() {
        id = createId();
        position = randomPosition();
        stepCounter = 0;
        mateCounter = 0;
    }

    @Override
    public void step() {
        distanceFromQueen = queenDistance(position);
        stepsFromQueen = distanceFromQueen[0] + distanceFromQueen[1];
        if (stepsFromQueen > 3) {
            moveToQueen();
        }
        if (stepsFromQueen <= 3) {
            if (matingMood) {
                mate();
            }
            if (mateCounter > 0 && mateCounter < 10) {
                mate();
            }
            else {
                kickedOut();
            }
        }
    }

    private void mate() {
        System.out.println("HALLELUJAH");
        mateCounter++;
    }

    private void kickedOut() {
        position[0] += 50;
        position[1] += 50;
        System.out.println("D'OH");
        mateCounter = 0;
    }



    private void moveToQueen() {
        switch (stepCounter%2) {
            case 0:
                if (position[0] < 0) {
                    position[0]++;}
                if (position[0] > 0) {
                    position[0]--;
                    }
            case 1:
                if(position[1] < 0) {
                    position[1]++;
                }
                if (position[1] > 0) {
                    position[1]--;
                }
        }
    }
}

