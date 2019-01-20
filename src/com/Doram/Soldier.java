package com.Doram;

import java.util.Random;

public class Soldier extends Colony{
    private int patrolCounter;
    int id;

    public void Soldier() {
        position = randomPosition();
        patrolCounter = 0;
        this.id = createId();
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
