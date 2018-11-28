package main;

import animal.Animal;
import factory.AnimalFactory;
import factory.RandomAnimalFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        AnimalFactory factory = new RandomAnimalFactory();

        for (int i = 0; i < 10; i++) {
            animals.add(factory.create());
        }

        for (Animal animal: animals) {
            System.out.println(animal.getClass());
        }
    }
}
