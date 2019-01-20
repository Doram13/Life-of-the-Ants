package com.Doram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.Math;


public abstract class Colony {

    int[] position = new int[2];
    boolean waspAttack = false;
    int queenDistance;
    boolean matingMood;
    private int numberOfAnts;
    List<Worker> workers = new ArrayList<Worker>();
    List<Soldier> soldiers = new ArrayList<Soldier>();
    List<Drone> drones = new ArrayList<Drone>();

    public abstract void step();

    int createId() {
        numberOfAnts++;
        return numberOfAnts;
    }


    protected int[] randomPosition() {

        Random rand = new Random();
        position[0] = rand.nextInt(99) + 1;
        position[1] = rand.nextInt(99) +1;
        return position;
    }

    public int[] queenDistance(int[] distanceFrom) {
        int[] distanceFromQueen = new int[2];
        distanceFromQueen[0] = Math.abs(0 - distanceFrom[0]);
        distanceFromQueen[1] = Math.abs(0 - distanceFrom[1]);
        return distanceFromQueen;
    }


    public boolean isMatingMood() {
        return matingMood;
    }

    public boolean isWaspAttack() {
        return waspAttack;
    }

    public void setMatingMood(boolean matingMood) {
        this.matingMood = matingMood;
    }

    public void setWaspAttack(boolean waspAttack) {
        this.waspAttack = waspAttack;
    }



}
