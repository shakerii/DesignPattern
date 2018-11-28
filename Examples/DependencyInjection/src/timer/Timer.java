package timer;

import exception.TimeInvalidException;
import service.Logger;

import java.util.concurrent.TimeUnit;

public class Timer {

    private Logger logger;

    public Timer(Logger logger) {
        this.logger = logger;
    }

    public void waitSec(int sec) throws TimeInvalidException {
        if (sec > 60) {
            this.logger.log("TimeInvalidException second is more than 59\n");
            throw new TimeInvalidException();
        }
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException e) {
            this.logger.log(e.getMessage());
        }
    }
}
