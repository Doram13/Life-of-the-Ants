package com.Doram;

import static com.Doram.Drone.drones;
import static com.Doram.Soldier.soldiers;
import static com.Doram.Worker.workers;

public class GameLoop extends Colony {
    private int turn;



    GameLoop() {
        this.turn = 0;
        if (this.turn == 0) {
            for (int i = 0; i <= 1; i++) {
                Worker worker = new Worker();
            }
            for (int j = 0; j <= 1; j++) {
                Soldier soldier = new Soldier();

            }
            for (int k = 0; k <= 15; k++) {
                Drone drone = new Drone();
            }
        }
        Queen queen = new Queen();
        startLoop(queen);
    }

    public void startLoop(Queen queen) {
    do {
        queen.step();
        for (Worker worker: workers) {
            worker.step();
        }
        for (Soldier soldier: soldiers) {
            soldier.step();
        }
        for (Drone drone: drones) {
            drone.step();
        }
        this.turn++;
    } while (this.turn <= 300);
    }


    @Override
    public void step() {

    }
}
