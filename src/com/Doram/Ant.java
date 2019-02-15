package com.Doram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.Math;


public abstract class Ant {

    int[] position = new int[2];
    //static boolean matingMood = false;
    private static int numberOfAnts = 0;


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

    protected int[] queenDistance(int[] distanceFrom) {
        int[] distanceFromQueen = new int[2];
        distanceFromQueen[0] = Math.abs(0 - distanceFrom[0]);
        distanceFromQueen[1] = Math.abs(0 - distanceFrom[1]);
        return distanceFromQueen;
    }
}
