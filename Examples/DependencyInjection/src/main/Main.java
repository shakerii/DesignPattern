package main;

import exception.TimeInvalidException;
import service.Logger;
import timer.Timer;

public class Main {

    public static void main(String[] args) {
        Logger logger = new Logger();

        Timer timer = new Timer(logger);

        try {
            timer.waitSec(65);
        } catch (TimeInvalidException e) {
            e.printStackTrace();
        }
    }
}
