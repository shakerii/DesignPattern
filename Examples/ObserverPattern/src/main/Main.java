package main;

import observable.Shepherd;
import observer.Sheep;

public class Main {

    public static void main(String args[]) {
        Shepherd shepherd = new Shepherd();

        Sheep sheep1 = new Sheep(shepherd);
        Sheep sheep2 = new Sheep(shepherd);
        Sheep sheep3 = new Sheep(shepherd);
        Sheep sheep4 = new Sheep(shepherd);
        Sheep sheep5 = new Sheep(shepherd);

//        shepherd.removeObserver(sheep1);
//        shepherd.removeObserver(sheep2);

        try {
            shepherd.observeWolf();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
