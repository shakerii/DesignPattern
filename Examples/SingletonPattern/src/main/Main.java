package main;

import singleton.Counter;

public class Main {

    public static void main(String[] args) {
        Counter counter = Counter.getInstance();
        counter.count();

        Counter counter2 = Counter.getInstance();
        counter2.count();
    }
}
