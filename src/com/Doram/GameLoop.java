package com.Doram;

public class GameLoop extends Colony {
    private int turn;



    GameLoop() {
        turn = 0;
        if (turn == 0) {
            for (int i = 0; i <= 25; i++) {
                Worker worker = new Worker();
                workers.add(worker);
            }
            for (int j = 0; j <= 10; j++) {
                Soldier soldier = new Soldier();
                soldiers.add(soldier);
            }
            for (int k = 0; k <= 10; k++) {
                Drone drone = new Drone();
                drones.add(drone);
            }
        }
        Queen queen = new Queen();
        startLoop(queen);
    }

    public void startLoop(Queen queen) {
    do {
        queen.step();
        for (Worker worker: workers ) {
            worker.step();
        }
        for (Soldier soldier: soldiers) {
            soldier.step();
        }
        for (Drone drone: drones) {
            drone.step();
        }
        turn++;
    } while (turn <= 300);
    }


    @Override
    public void step() {

    }
}
