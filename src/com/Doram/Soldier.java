package com.Doram;

import java.util.Random;

public class Soldier extends Colony{
    private int patrolCounter;

    public void Soldier() {
        position[0] = xPos;
        position[1] = yPos;
        patrolCounter = 0;
    }

    @Override
    public void step() {
        switch (patrolCounter) {
            case 0:
                position[0] += 1;
                patrolCounter++;
            case 1:
                position[1] += 1;
                patrolCounter++;
            case 2:
                position[0] += -1;
                patrolCounter++;
            case 3:
                position[1] += -1;
                patrolCounter = 0;
        }
    }
}
