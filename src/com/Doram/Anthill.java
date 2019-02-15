package com.Doram;

import java.util.ArrayList;
import java.util.List;


public class Anthill {
    private int turn;
     private List<Worker> workers = new ArrayList<Worker>();
     private List<Drone> drones = new ArrayList<Drone>();
     private List<Soldier> soldiers = new ArrayList<Soldier>();
     protected Queen queen;

    Anthill() {
        this.turn = 0;
        this.queen = new Queen();
        if (this.turn == 0) {
            for (int i = 0; i <= 1; i++) {
                Worker worker = new Worker();
                workers.add(worker);
            }
            for (int j = 0; j <= 1; j++) {
                Soldier soldier = new Soldier();
                soldiers.add(soldier);
            }
            for (int k = 0; k <= 5; k++) {
                Drone drone = new Drone();
                drones.add(drone);
                drone.setQueen(queen);
            }
        }
        startLoop();
    }

    public void startLoop() {
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
        turn++;
    } while (this.turn <= 300);
    }

}
