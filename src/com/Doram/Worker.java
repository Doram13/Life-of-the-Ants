package com.Doram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker extends Ant {

    private int id;


    public Worker() {
        this.position = randomPosition();
        this.id = createId();

        }

    @Override
     public void step() {
        Random rand = new Random();
        int direction = rand.nextInt(3);
        switch (direction) {
            case 0:
                this.position[0] += 1;
                break;
            case 1:
                this.position[0] += -1;
                break;
            case 2:
                this.position[1] += 1;
                break;
            case 3:
                this.position[1] += -1;
                break;
        }
      //  System.out.println("I'm Worker " + this.id + " I'm at " + this.position[0] + "-" + this.position[1] + " position");

    }
}
