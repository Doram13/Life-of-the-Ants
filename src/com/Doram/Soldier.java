package com.Doram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Soldier extends Colony{
    private int patrolCounter;
    int id;
    static List<Soldier> soldiers = new ArrayList<Soldier>();

    public void Soldier() {
        this.position = randomPosition();
        this.patrolCounter = 0;
        this.id = createId();
        soldiers.add(this);
    }

    @Override
    public void step() {
        switch (patrolCounter) {
            case 0:
                this.position[0] += 1;
                patrolCounter++;
            case 1:
                this.position[1] += 1;
                patrolCounter++;
            case 2:
                this.position[0] += -1;
                patrolCounter++;
            case 3:
                this.position[1] += -1;
                patrolCounter = 0;
        }
    }
}
