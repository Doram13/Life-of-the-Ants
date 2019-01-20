package com.Doram;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    innitColony();
    }

    private static void innitColony() {
        GameLoop gameLoop = new GameLoop();
    }
}
/*

private static void createVehicles(Race race) {
    List<Car> listOFCars = new ArrayList<>();
    List<Motorcycle> listOfMotors = new ArrayList<>();
    List<Truck> listOfTrucks = new ArrayList<>();

    for (int i = 0; i < 3; i++) {
        Car car = new Car();
        Motorcycle motor = new Motorcycle();
        Truck truck = new Truck();
        listOFCars.add(car);
        listOfMotors.add(motor);
        listOfTrucks.add(truck);
    }

    race.listVehicles(listOFCars,listOfMotors,listOfTrucks);
}

    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);

        race.simulateRace(race);
        race.printRaceResults();
    } */
