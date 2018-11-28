package main;

import duck.Duck;
import duck.NormalDuck;
import duck.RubberDuck;
import duck.WoodenDuck;

public class Main {

    public static void main(String[] args) {
        Duck duck;

        duck = new NormalDuck();
        duck.fly();
        duck.quack();
        System.out.println("---");

        duck = new RubberDuck();
        duck.fly();
        duck.quack();
        System.out.println("---");

        duck = new WoodenDuck();
        duck.fly();
        duck.quack();

    }
}
