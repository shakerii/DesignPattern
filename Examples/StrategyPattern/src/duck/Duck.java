package duck;

import fly.FlyBehaviorInterface;
import quack.QuackBehaviorInterface;

public abstract class Duck {

    protected FlyBehaviorInterface flyBehavior;

    protected QuackBehaviorInterface quackBehavior;

    public FlyBehaviorInterface getFlyBehavior() {
        return flyBehavior;
    }

    public Duck setFlyBehavior(FlyBehaviorInterface flyBehavior) {
        this.flyBehavior = flyBehavior;

        return this;
    }

    public void fly() {
        this.flyBehavior.fly();
    }

    public void quack() {
        this.quackBehavior.quack();
    }

    public QuackBehaviorInterface getQuackBehavior() {
        return quackBehavior;
    }

    public Duck setQuackBehavior(QuackBehaviorInterface quackBehavior) {
        this.quackBehavior = quackBehavior;

        return this;
    }
}
