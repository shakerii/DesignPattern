package duck;

import fly.NoFly;
import quack.NoQuack;

public class WoodenDuck extends Duck {

    public WoodenDuck() {
        this.quackBehavior = new NoQuack();
        this.flyBehavior = new NoFly();
    }
}
