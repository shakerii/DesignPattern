package observer;

import observable.Shepherd;

public class Sheep extends AbstractObserver {

    public Sheep(Shepherd shepherd) {
        super(shepherd);
    }

    @Override
    public void update() {
        System.out.println("Hear the shepherd");
        if (((Shepherd) this.observable).isScared())
            System.out.println("Run...");
    }
}
