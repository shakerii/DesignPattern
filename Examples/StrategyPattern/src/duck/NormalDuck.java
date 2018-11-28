package duck;

import fly.NormalFly;
import quack.NormalQuack;

public class NormalDuck extends Duck {

    public NormalDuck() {
        this.quackBehavior = new NormalQuack();
        this.flyBehavior = new NormalFly();
    }
}
