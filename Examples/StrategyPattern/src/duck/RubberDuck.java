package duck;

import fly.NoFly;
import quack.NormalQuack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.quackBehavior = new NormalQuack();
        this.flyBehavior = new NoFly();
    }
}
