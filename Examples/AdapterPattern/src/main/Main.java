package main;

import animal.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<AnimalAdapter> animals = new ArrayList<>();
        animals.add(new BirdAdapter());
        animals.add(new ChickenAdapter());
        animals.add(new BirdAdapter());
        animals.add(new ChickenAdapter());
        animals.add(new BirdAdapter());
        animals.add(new BirdAdapter());
        animals.add(new ChickenAdapter());

        for (AnimalAdapter animal: animals) {
            animal.action();
        }
    }
}
