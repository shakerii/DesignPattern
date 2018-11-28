package observable;

import java.util.concurrent.TimeUnit;

public class Shepherd extends AbstractObservable {

    private boolean scared;

    public Shepherd() {
        super();
        this.scared = false;
    }

    public boolean isScared() {
        return scared;
    }

    public void observeWolf() throws InterruptedException {
        System.out.println("Observe wolf...");
        this.scared = true;
        TimeUnit.SECONDS.sleep(1);
        System.out.println("YELL...");
        System.out.println();
        notifyObservers();
    }
}
