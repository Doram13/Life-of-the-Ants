package com.Doram;

import java.util.Random;

public class Worker extends Colony {

    public Worker() {
        position = randomPosition();
    }

    @Override
     public void step() {
        Random rand = new Random();
        int direction = rand.nextInt(3);
        switch (direction) {
            case 0:
                position[0] += 1;
                break;
            case 1:
                position[0] += -1;
                break;
            case 2:
                position[1] += 1;
                break;
            case 3:
                position[1] += -1;
                break;
        }
    }
}
